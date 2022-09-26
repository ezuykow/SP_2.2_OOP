package transport;

import java.time.LocalDate;
import java.util.Date;
import java.util.regex.Pattern;

public class Car {

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

    public class Insurance {

        private double cost;
        private String number;
        private LocalDate validity;

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

    private final String brand;
    private final String model;
    private final String assemblyCountry;
    private final String bodyType;
    private final int numSeats;
    private final int yearOfProduction;
    private String color;
    private String transmission;
    private String regNum;
    private int wheels; //0 - for summer, 1 - for winter
    private float engineVolume;

    private Key key;
    private Insurance insurance;
    private static final String d = "<default>"; //default value
    private static final String RIGHT_REG_NUM = "[a-z]\\d{3}[a-z]{2}\\d{2,3}";

    public Car(String brand, String model, String assemblyCountry, String bodyType, int numSeats,
               int yearOfProduction, String color, String transmission, String regNum, int wheels,
               float engineVolume) {
        this.brand = brand;
        this.model = model;
        this.assemblyCountry = assemblyCountry;
        this.bodyType = bodyType;
        this.numSeats = numSeats;
        this.yearOfProduction = yearOfProduction;
        setColor(color);
        setTransmission(transmission);
        setRegNum(regNum);
        setWheels(wheels);
        setEngineVolume(engineVolume);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getAssemblyCountry() {
        return assemblyCountry;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = ((color == null) || (color.isEmpty()) || (color.isBlank()))
                ? d
                : color;
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
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", assemblyCountry='" + assemblyCountry + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", numSeats=" + numSeats +
                ", yearOfProduction=" + yearOfProduction +
                ", color='" + color + '\'' +
                ", transmission='" + transmission + '\'' +
                ", regNum='" + regNum + '\'' +
                ", wheels=" + wheels +
                ", engineVolume=" + engineVolume +
                '}';
    }
}
