public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Grande", "yellow",
                "Russia", 2015, 1.7F);

        Car audi = new Car("Audi", "A8 50 L TDI quattro", "black",
                "Germany", 2020, 3.0F);

        Car bmw = new Car("BMW", "Z8", "black",
                "Germany",  2021, 3.0F);

        Car kia =  new Car("Kia", "Sportage mk4", "red",
                "South Korea", 2018, 2.4F);

        Car hyundai = new Car("Hyundai", "Avante", "orange",
                "South Korea", 2016, 1.6F);

        System.out.printf("%s\n%s\n%s\n%s\n%s\n", lada, audi, bmw, kia, hyundai);
    }
}
