import competition.Competing;
import driver.Driver;
import transport.Transport;
import transport.bus.Bus;
import transport.car.Car;
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

        Driver<Car> driver1 = new Driver<>("Ivan", 'B', 3, (Car) transport.get(0));
        Driver<Truck> driver2 = new Driver<>("Mike", 'C', 1, (Truck) transport.get(5));
        Driver<Bus> driver3 = new Driver<>("Kate", 'D', 1, (Bus) transport.get(10));

        System.out.println();
        writeRacerInfo(driver1);
        writeRacerInfo(driver2);
        writeRacerInfo(driver3);
    }

    private static List<Competing> getCars() {
        List<Competing> cars = new ArrayList<>();

        cars.add(new Car("Lada", "Granta", 1.6F));
        cars.add(new Car("Ford", "Focus ST", 2.0F));
        cars.add(new Car("Ford", "Mondeo Mk5", 2.5F));
        cars.add(new Car("Ford", "F-150 Raptor", 7.2F));

        return cars;
    }

    private static List<Competing> getTrucks() {
        List<Competing> trucks = new ArrayList<>();

        trucks.add(new Truck("KAMAZ", "53501", 6.0F));
        trucks.add(new Truck("KAMAZ", "4310", 6.0F));
        trucks.add(new Truck("KAMAZ", "5350", 6.0F));
        trucks.add(new Truck("KAMAZ", "4350", 6.0F));

        return trucks;
    }

    private static List<Competing> getBuses() {
        List<Competing> buses = new ArrayList<>();

        buses.add(new Bus("Icarus", "T-200", 4.5F));
        buses.add(new Bus("Icarus", "T-300", 5.0F));
        buses.add(new Bus("Icarus", "T-400", 5.5F));
        buses.add(new Bus("Icarus", "T-500", 7.0F));

        return buses;
    }

    private static void writeRacerInfo(Driver<? extends Transport> d) {
        System.out.printf("Driver %s drives transport %s %s and will participate in the race!\n",
                d.getName(),
                d.getTransport().getBrand(),
                d.getTransport().getModel());
    }
}