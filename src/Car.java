public class Car {
    String brand;
    String model;
    String color;
    String assemblyCountry;
    int yearOfProduction;
    double engineVolume;

    @Override
    public String toString() {
        return String.format("%s %s, product in %s in %d, body color - %s, engine volume - %.1f",
                brand, model, assemblyCountry, yearOfProduction, color, engineVolume);
    }
}
