package transport.refill;

public class GasRefill implements RefillBehavior{
    @Override
    public void refill() {
        System.out.println("This transport need to be refilled with gasoline.");
    }
}
