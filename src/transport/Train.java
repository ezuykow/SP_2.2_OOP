package transport;

import transport.refill.DieselRefill;

public class Train extends Transport {
    private double tripCost;
    private int tripTimeMinutes;
    private String tripFrom;
    private String tripTo;
    private int carriageCount;

    public Train(String brand, String model, int yearOfProduction, String assemblyCountry,
                 String color, int maxSpeed, double tripCost, int tripTimeMinutes, String tripFrom,
                 String tripTo, int carriageCount) {
        super(brand, model, yearOfProduction, assemblyCountry, color, maxSpeed);
        setTripCost(tripCost);
        setTripTimeMinutes(tripTimeMinutes);
        setTripFrom(tripFrom);
        setTripTo(tripTo);
        setCarriageCount(carriageCount);
        setRefillBehavior(new DieselRefill());
    }

    @Override
    public void refill() {
        getRefillBehavior().refill();
    }

    public double getTripCost() {
        return tripCost;
    }

    public void setTripCost(double tc) {
        this.tripCost = (tc >= 0)
                ? tc
                : 0;
    }

    public int getTripTimeMinutes() {
        return tripTimeMinutes;
    }

    public void setTripTimeMinutes(int ttm) {
        this.tripTimeMinutes = (ttm >= 0)
                ? ttm
                : 1;
    }

    public String getTripFrom() {
        return tripFrom;
    }

    public void setTripFrom(String tf) {
        this.tripFrom = ((tf == null) || (tf.isEmpty()) || (tf.isBlank()))
                ? d
                : tf;
    }

    public String getTripTo() {
        return tripTo;
    }

    public void setTripTo(String tt) {
        this.tripTo = ((tt == null) || (tt.isEmpty()) || (tt.isBlank()))
                ? d
                : tt;
    }

    public int getCarriageCount() {
        return carriageCount;
    }

    public void setCarriageCount(int cc) {
        this.carriageCount = (cc >= 0)
                ? cc
                : 1;
    }

    @Override
    public String toString() {
        return "Train: " +
                getBrand() +
                " " + getModel() +
                ", produced in " + getAssemblyCountry() +
                ", year of production " + getYearOfProduction() +
                ", color - " + getColor() +
                ", cost of trip - " + getTripCost() +
                ", trip time in minutes - " + getTripTimeMinutes() +
                ", begin station - " + getTripFrom() +
                ", end station - " + getTripTo() +
                ", count of carriage - " + getCarriageCount() +
                ", speed of trip - " + getMaxSpeed();
    }
}
