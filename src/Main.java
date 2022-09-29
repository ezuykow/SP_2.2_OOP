import transport.Bus;
import transport.Car;
import transport.Train;
import transport.Transport;
import transport.refill.DieselRefill;
import transport.refill.ElectricRefill;
import transport.refill.GasRefill;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Transport> transports;

        System.out.println("Cars:");
        transports = getCars();
        transports.forEach(c -> {
            System.out.println(c);
            c.refill();
        });

        System.out.println("\nTrains:");
        transports = getTrains();
        transports.forEach(c -> {
            System.out.println(c);
            c.refill();
        });

        System.out.println("\nBuses:");
        transports = getBuses();
        transports.forEach(c -> {
                System.out.println(c);
                c.refill();
        });
    }

    private static List<Transport> getCars() {
        List<Transport> cars = new ArrayList<>();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu-MM-dd");

        Car temp = new Car("Lada", "Grande", "Russia",
                "coupe", 4, 2015, "white",
                "auto", "x001cb777",0, 1.7F, 160);
        temp.setKey(new Car.Key(true, true));
        temp.setInsurance(new Car.Insurance(12000, "156348572", LocalDate.parse("2021-11-10", dtf)));
        temp.setRefillBehavior(new ElectricRefill());
        cars.add(temp);

        temp = new Car("Audi", "A8 50 L TDI quattro", "Germany",
                "coupe", 4, 2020, "yellow",
                "auto", "b342tt152", 0, 3.0F, 220);
        temp.setKey(new Car.Key(true, true));
        temp.setInsurance(new Car.Insurance(12000, "156363671", LocalDate.parse("2021-11-10", dtf)));
        temp.setRefillBehavior(new GasRefill());
        cars.add(temp);

        temp = new Car("Audi", "A8 50 L TDI quattro", "Germany",
                "coupe", 4, 2020, "black",
                "auto", "b777ec76", 0, 3.0F, 220);
        temp.setKey(new Car.Key(true, true));
        temp.setInsurance(new Car.Insurance(12000, "156363098", LocalDate.parse("2021-11-10", dtf)));
        temp.setRefillBehavior(new GasRefill());
        cars.add(temp);

        temp = new Car("Audi", "A8 50 L TDI quattro", "Germany",
                "coupe", 4, 2020, "black",
                "auto", "b067ep67", 0, 3.0F, 220);
        temp.setKey(new Car.Key(true, true));
        temp.setInsurance(new Car.Insurance(12000, "156363546", LocalDate.parse("2021-11-10", dtf)));
        temp.setRefillBehavior(new DieselRefill());
        cars.add(temp);

        return cars;
    }

    private static List<Transport> getTrains() {
        Train train;
        List<Transport> trains = new ArrayList<>();

        train = new Train("Martin" , "B-901", 2011, "Russia",
                null, 301, 3500, 0, "Belorussian RS",
                "Minsk-Pass", 11);
        trains.add(train);

        train = new Train("Leningrad", "D-125", 2019, "Russia",
                null, 270, 1700, 0, "Leningrad`s RS",
                "Leningrad-Pass", 8);
        trains.add(train);

        train = null;
        return trains;
    }

    private static List<Transport> getBuses() {
        List<Transport> buses = new ArrayList<>();
        Bus bus;

        bus = new Bus("Icarus", "T-200", 2001, "Russia",
                "white", 80);
        bus.setRefillBehavior(new DieselRefill());
        buses.add(bus);

        bus = new Bus("Icarus", "T-200", 2005, "Russia",
                "white", 90);
        bus.setRefillBehavior(new GasRefill());
        buses.add(bus);

        bus = new Bus("Icarus", "T-200", 2010, "Russia",
                "white", 100);
        bus.setRefillBehavior(new GasRefill());
        buses.add(bus);

        bus = null;
        return buses;
    }
}
