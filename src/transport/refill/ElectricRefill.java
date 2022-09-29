package transport.refill;

public class ElectricRefill implements RefillBehavior{
    @Override
    public void refill() {
        System.out.println("This transport need to be refilled with electricity.");
    }
}
