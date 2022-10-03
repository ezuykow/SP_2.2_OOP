package transport.car;

import competition.Competing;
import transport.Transport;

public class Car extends Transport implements Competing {

    public Car(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
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
}
