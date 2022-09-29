package transport;

import java.time.LocalDate;
import java.util.Date;
import java.util.regex.Pattern;

public class Car extends  Transport{

    public static class Key {

        private final boolean distLaunch;
        private final boolean keylessEntry;
        public Key(boolean distLaunch, boolean keylessEntry) {
            this.distLaunch = distLaunch;
            this.keylessEntry = keylessEntry;
        }

        public boolean isDistLaunch() {
            return distLaunch;
        }

        public boolean isKeylessEntry() {
            return keylessEntry;
        }

    }
    public static class Insurance {

        private double cost;

        private String number;
        private final LocalDate validity;
        public Insurance(double cost, String number, LocalDate validity) {
            this.validity = validity;
            if (cost >= 0) {
                this.cost = cost;
            } else {
                System.out.println("Error cost!");
            }
            if (number.matches("[0-9]{9}")) {
                this.number = number;
            } else {
                System.out.println("Wrong number!");
            }
        }

        public void checkValidity(){
            if (validity.isBefore(LocalDate.now())) {
                System.out.println("You need to get new insurance!");
            }
        }

        public double getCost() {
            return cost;
        }
        public String getNumber() {
            return number;
        }

        public LocalDate getValidity() {
            return validity;
        }

    }
    private String bodyType;

    private int numSeats;
    private String transmission;
    private String regNum;
    private int wheels; //0 - for summer, 1 - for winter
    private float engineVolume;
    private Key key;

    private Insurance insurance;

    public Car(String brand, String model, String assemblyCountry, String bodyType, int numSeats,
               int yearOfProduction, String color, String transmission, String regNum, int wheels,
               float engineVolume, int maxSpeed) {
        super(brand, model, yearOfProduction, assemblyCountry, color, maxSpeed);
        setBodyType(bodyType);
        setNumSeats(numSeats);
        setColor(color);
        setTransmission(transmission);
        setRegNum(regNum);
        setWheels(wheels);
        setEngineVolume(engineVolume);
    }

    @Override
    public void refill() {
        getRefillBehavior().refill();
    }

    public String getBodyType() {
        return bodyType;
    }

    private void setBodyType(String bt) {
        this.bodyType = ((bt == null) || (bt.isBlank()) || (bt.isEmpty()))
                ? d
                : bt;
    }

    public int getNumSeats() {
        return numSeats;
    }

    private void setNumSeats(int ns) {
        this.numSeats = Math.max(ns, 1);
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = ((transmission == null) || (transmission.isEmpty()) || (transmission.isBlank()))
                ? d
                : transmission;
    }

    public String getRegNum() {
        return regNum;
    }

    public void setRegNum(String regNum) {
        this.regNum = (regNum.matches(RIGHT_REG_NUM))
                ? regNum
                : d;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = ((wheels == 1) || (wheels == 0))
                ? wheels
                : 0;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public void swapWheels() {
        wheels = (wheels == 0)
                ? 1
                : 0;
    }

    @Override
    public String toString() {
        return "Car: " +
                getBrand() + " " +
                getModel() +
                ", produced in " + getAssemblyCountry() +
                ", body type - " + bodyType +
                ", number of seats - " + numSeats +
                ", year of production " + getYearOfProduction() +
                ", color - " + getColor() +
                ", transmission - " + transmission +
                ", reg. number - " + regNum +
                ", wheels - " + ((wheels == 0) ? "for winter" : "for summer") +
                ", engine volume - " + engineVolume +
                ", insurance num. - " + insurance.getNumber();
    }
}
