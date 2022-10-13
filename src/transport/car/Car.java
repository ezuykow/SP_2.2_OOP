package transport.car;

import competition.Competing;
import transport.Transport;

public class Car extends Transport implements Competing {

    private final BodyType bodyType;

    public Car(String brand, String model, float engineVolume, BodyType bodyType) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;
    }

    @Override
    protected void startMoving() {
        System.out.printf("%s %s started moving",
                getBrand(),
                getModel());
    }

    @Override
    protected void endMoving() {
        System.out.printf("%s %s ended moving",
                getBrand(),
                getModel());
    }

    @Override
    public void diagnostic() {
        diagnosticCarried = true;
        System.out.printf("%s %s has been diagnosed\n", getBrand(), getModel());
    }

    @Override
    public void pitStop() {
        System.out.printf("%s %s on the pit stop\n",
                getBrand(),
                getModel());
    }

    @Override
    public void maxSpeed() {
        System.out.printf("The maximum speed of %s %s is <no info>\n",
                getBrand(),
                getModel());
    }

    @Override
    public void bestLapTime() {
        System.out.printf("The best lap time of %s %s is <no info>\n",
                getBrand(),
                getModel());
    }

    public BodyType getBodyType() {
        return bodyType;
    }
}
