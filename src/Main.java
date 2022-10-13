import competition.Competing;
import driver.Driver;
import exception.TransportWithoutDiagnostic;
import transport.Transport;
import transport.bus.Bus;
import transport.bus.PayloadClass;
import transport.car.BodyType;
import transport.car.Car;
import transport.truck.LoadCapacity;
import transport.truck.Truck;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<Competing> transport = new ArrayList<>();
        transport.addAll(getCars());
        transport.addAll(getTrucks());
        transport.addAll(getBuses());

        transport.forEach(t -> {
            t.pitStop();
            t.maxSpeed();
            t.bestLapTime();
        });

        Driver<Car> ivan = new Driver<>("Ivan", 'B', 3, (Car) transport.get(0));
        Driver<Truck> mike = new Driver<>("Mike", 'C', 1, (Truck) transport.get(5));
        Driver<Bus> kate = new Driver<>("Kate", 'D', 1, (Bus) transport.get(10));

        List<Driver<? extends Transport>> drivers = new ArrayList<>();
        drivers.add(ivan);
        drivers.add(mike);
        drivers.add(kate);

        System.out.println();
        drivers.forEach(Main::writeDriverInfo);

        System.out.println();
        for (Competing t : transport) {
            ((Transport) t).diagnostic();
        }
        checkDiagnostic(transport);
    }

    private static void checkDiagnostic(List<?> transport) {
        transport.forEach(t -> {
            if (t instanceof Bus) {
                System.out.printf("The bus %s %s does not needed diagnostic\n",
                        ((Bus) t).getBrand(),
                        ((Bus) t).getModel());
            } else {
                if (((Transport) t).getDiagnosticCarried()) {
                    System.out.printf("%s %s has been diagnosed\n",
                            ((Transport) t).getModel(),
                            ((Transport) t).getBrand());
                } else {
                    throw new TransportWithoutDiagnostic(String.format("%s %s has not been diagnosed",
                            ((Transport) t).getBrand(),
                            ((Transport) t).getModel()));
                }
            }
        });
    }
    private static List<Competing> getCars() {
        List<Competing> cars = new ArrayList<>();

        cars.add(new Car("Lada", "Granta", 1.6F, BodyType.SEDAN));
        cars.add(new Car("Ford", "Focus ST", 2.0F, BodyType.SEDAN));
        cars.add(new Car("Ford", "Mondeo Mk5", 2.5F, BodyType.SEDAN));
        cars.add(new Car("Ford", "F-150 Raptor", 7.2F, BodyType.PICKUP));

        return cars;
    }

    private static List<Competing> getTrucks() {
        List<Competing> trucks = new ArrayList<>();

        trucks.add(new Truck("KAMAZ", "53501", 6.0F, LoadCapacity.N2));
        trucks.add(new Truck("KAMAZ", "4310", 6.0F, LoadCapacity.N2));
        trucks.add(new Truck("KAMAZ", "5350", 6.0F, LoadCapacity.N2));
        trucks.add(new Truck("KAMAZ", "4350", 6.0F, LoadCapacity.N2));

        return trucks;
    }

    private static List<Competing> getBuses() {
        List<Competing> buses = new ArrayList<>();

        buses.add(new Bus("Icarus", "T-200", 4.5F, PayloadClass.LOW));
        buses.add(new Bus("Icarus", "T-300", 5.0F, PayloadClass.EXTRA_BIG));
        buses.add(new Bus("Icarus", "T-400", 5.5F, PayloadClass.BIG));
        buses.add(new Bus("Icarus", "T-500", 7.0F, PayloadClass.LOW));

        return buses;
    }

    private static void writeDriverInfo(Driver<? extends Transport> d) {
        System.out.printf("Driver %s drives transport %s %s and will participate in the race!\n",
                d.getName(),
                d.getTransport().getBrand(),
                d.getTransport().getModel());
    }
}