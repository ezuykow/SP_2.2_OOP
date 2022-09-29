package transport;

import transport.refill.RefillBehavior;

public abstract class Transport {
    public static final String d = "<default>"; //default value
    public static final String RIGHT_REG_NUM = "[a-z]\\d{3}[a-z]{2}\\d{2,3}";
    private String brand;
    private  String model;
    private int yearOfProduction;
    private String assemblyCountry;
    private String color;
    private int maxSpeed;

    private RefillBehavior refillBehavior;

    public Transport(String brand, String model, int yearOfProduction,
                     String assemblyCountry, String color, int maxSpeed) {
        setBrand(brand);
        setModel(model);
        setYearOfProduction(yearOfProduction);
        setAssemblyCountry(assemblyCountry);
        setColor(color);
        setMaxSpeed(maxSpeed);
    }

    public abstract void refill();

    public void setRefillBehavior(RefillBehavior refillBehavior) {
        this.refillBehavior = refillBehavior;
    }

    public RefillBehavior getRefillBehavior() {
        return refillBehavior;
    }

    private void setBrand(String brand) {
        this.brand = ((brand == null) || (brand.isEmpty()) || (brand.isBlank()))
                ? d
                : brand;
    }

    public String getBrand() {
        return brand;
    }

    private void setModel(String model) {
        this.model = ((model == null) || (model.isEmpty()) || (model.isBlank()))
                ? d
                : model;
    }

    public String getModel() {
        return model;
    }

    public void setYearOfProduction(int y) {
        this.yearOfProduction = Math.max(y, 0);
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setAssemblyCountry(String a) {
        this.assemblyCountry = ((a == null) || (a.isBlank()) || (a.isEmpty()))
                ? d
                : a;
    }

    public String getAssemblyCountry() {
        return assemblyCountry;
    }

    public void setColor(String c) {
        this.color = ((c == null) || (c.isEmpty()) || (c.isBlank()))
                ? "white"
                : c;
    }

    public String getColor() {
        return color;
    }

    public void setMaxSpeed(int ms) {
        this.maxSpeed = Math.max(ms, 0);
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}