import transport.Car;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = getCars();
        cars.forEach(c -> System.out.printf("%s\n", c));
    }

    private static List<Car> getCars() {
        List<Car> cars = new ArrayList<>();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu-MM-dd");

        Car temp = new Car("Lada", "Grande", "Russia",
                "coupe", 4, 2015, "white",
                "auto", "x001cb777",0, 1.7F);
        temp.setKey(new Car.Key(true, true));
        temp.setInsurance(temp.new Insurance(12000, "156363671", LocalDate.parse("2021-11-10", dtf)));
        cars.add(temp);

        temp = new Car("Audi", "A8 50 L TDI quattro", "Germany",
                "coupe", 4, 2020, "black",
                "auto", "b777op777", 0, 3.0F);
        temp.setKey(new Car.Key(true, true));
        temp.setInsurance(temp.new Insurance(12000, "156363671", LocalDate.parse("2021-11-10", dtf)));
        cars.add(temp);

        temp = new Car("Audi", "A8 50 L TDI quattro", "Germany",
                "coupe", 4, 2020, "black",
                "auto", "b777op777", 0, 3.0F);
        temp.setKey(new Car.Key(true, true));
        temp.setInsurance(temp.new Insurance(12000, "156363671", LocalDate.parse("2021-11-10", dtf)));
        cars.add(temp);

        cars.add(temp);

        return cars;
    }
}
