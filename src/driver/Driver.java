package driver;

import transport.Transport;
import transport.bus.Bus;
import transport.car.Car;
import transport.truck.Truck;

public class Driver<T extends Transport> {

    private static final String DEFAULT_VALUE = "<no info>";

    private String name;
    private char category;
    private int exp;

    private T transport;

    public Driver(String name, char category, int exp, T transport) {
        setName(name);
        setCategory(category);
        setExp(exp);
        setTransport(transport);
    }

    public void start() {
        System.out.println("Started moving");
    }

    public void stop() {
        System.out.println("Stopped moving");
    }

    public void refill() {
        System.out.println("Refilling transport");
    }

    public T getTransport() {
        return transport;
    }

    public void setTransport(T transport) {
        boolean f;
        switch (getCategory()) {
            case 'B':
                f = transport instanceof Car;
                break;
            case 'C':
                f = transport instanceof Truck;
                break;
            case 'D':
                f = transport instanceof Bus;
                break;
            default:
                f = false;
        }

        if (f) {
            this.transport = transport;
        } else {
            throw new IllegalArgumentException(getName() + " cant drive it!");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = ((name == null) || (name.isBlank()))
                ? DEFAULT_VALUE
                : name;
    }

    public char getCategory() {
        return category;
    }

    public void setCategory(char category) {
         if ((category == 'B') || (category == 'C') || (category == 'D')) {
             this.category = category;
         } else {
             throw new IllegalArgumentException("Wrong category!");
         }
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = Math.max(exp, 0);
    }
}
