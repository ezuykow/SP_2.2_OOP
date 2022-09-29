package transport.refill;

public class DieselRefill implements RefillBehavior{
    @Override
    public void refill() {
        System.out.println("This transport need to be refilled with diesel.");
    }
}
