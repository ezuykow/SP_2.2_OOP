import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Human maxim = new Human("Maxim", "Minsk",
                "brand manager", LocalDate.now().getYear() - 35);

        Human anya = new Human("Anya", "Moscow",
                "methodologist of education programs", LocalDate.now().getYear() - 29);

        Human katya = new Human("Katya", "Kaliningrad",
                "product manager", LocalDate.now().getYear() - 28);

        Human artyom = new Human("Artyom", "Moscow",
                "director of business development", LocalDate.now().getYear() - 27);

        maxim.sayHello();
        anya.sayHello();
        katya.sayHello();
        artyom.sayHello();
    }
}
