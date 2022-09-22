import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Human maxim = new Human();
        maxim.name = "Maxim";
        maxim.city = "Minsk";
        maxim.yearOfBirth = LocalDate.now().getYear() - 35;

        Human anya = new Human();
        anya.name = "Anya";
        anya.city = "Moscow";
        anya.yearOfBirth = LocalDate.now().getYear() - 29;

        Human katya = new Human();
        katya.name = "Katya";
        katya.city = "Kaliningrad";
        katya.yearOfBirth = LocalDate.now().getYear() - 28;

        Human artyom = new Human();
        artyom.name = "Artyom";
        artyom.city = "Moscow";
        artyom.yearOfBirth = LocalDate.now().getYear() - 27;

        maxim.sayHello();
    }
}
