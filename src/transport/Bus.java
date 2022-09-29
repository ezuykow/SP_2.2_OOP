package transport;

import transport.refill.DieselRefill;

public class Bus extends Transport{

    public Bus(String brand, String model, int yearOfProduction, String assemblyCountry,
               String color, int maxSpeed) {
        super(brand, model, yearOfProduction, assemblyCountry, color, maxSpeed);
    }

    @Override
    public void refill() {
        getRefillBehavior().refill();
    }

    @Override
    public String toString() {
        return "Bus: " +
                getBrand() +
                " " + getModel() +
                ", produced in " + getYearOfProduction() +
                " in " + getAssemblyCountry() +
                ", color - " + getColor() +
                ", maximum speed - " + getMaxSpeed();
    }
}
