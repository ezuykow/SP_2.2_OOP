public class Car {
    String brand;
    String model;
    String color;
    String assemblyCountry;
    int yearOfProduction;
    float engineVolume;

    private static final String d = "<default>"; //default value

    public Car() {
        this(d, d, "white", d, 2000, 1.5F);
    }

    public Car(String brand) {
        this(brand, d, "white", d, 2000, 1.5F);
    }

    public Car(String brand, int yearOfProduction) {
        this(brand, d, "white", d, yearOfProduction, 1.5F);
    }

    public Car(String brand, float engineVolume) {
        this(brand, d, "white", d, 2000, engineVolume);
    }

    public Car(String brand, int yearOfProduction, float engineVolume) {
        this(brand, d, "white", d, yearOfProduction, engineVolume);
    }

    public Car(String brand, String model) {
        this(brand, model, "white", d, 2000, 1.5F);
    }

    public Car(String brand, String model, int yearOfProduction) {
        this(brand, model, "white", d, yearOfProduction, 1.5F);
    }

    public Car(String brand, String model, float engineVolume) {
        this(brand, model, "white", d, 2000, engineVolume);
    }

    public Car(String brand, String model, int yearOfProduction, float engineVolume) {
        this(brand, model, "white", d, yearOfProduction, engineVolume);
    }

    public Car(String brand, String model, String color) {
        this(brand, model, color, d, 2000, 1.5F);
    }

    public Car(String brand, String model, String color, int yearOfProduction) {
        this(brand, model, color, d, yearOfProduction, 1.5F);
    }

    public Car(String brand, String model, String color, float engineVolume) {
        this(brand, model, color, d, 2000, engineVolume);
    }

    public Car(String brand, String model, String color, int yearOfProduction, float engineVolume) {
        this(brand, model, color, d, yearOfProduction, engineVolume);
    }

    public Car(String brand, String model, String color, String assemblyCountry) {
        this(brand, model, color, assemblyCountry, 2000, 1.5F);
    }

    public Car(String brand, String model, String color, String assemblyCountry, int yearOfProduction) {
        this(brand, model, color, assemblyCountry, yearOfProduction, 1.5F);
    }

    public Car(String brand, String model, String color, String assemblyCountry, float engineVolume) {
        this(brand, model, color, assemblyCountry, 2000, engineVolume);
    }

    public Car(String brand, String model, String color, String assemblyCountry, int yearOfProduction, float engineVolume) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.assemblyCountry = assemblyCountry;
        this.yearOfProduction = yearOfProduction;
        this.engineVolume = engineVolume;
    }

    @Override
    public String toString() {
        return String.format("%s %s, product in %s in %d, body color - %s, engine volume - %.1f",
                brand, model, assemblyCountry, yearOfProduction, color, engineVolume);
    }
}
