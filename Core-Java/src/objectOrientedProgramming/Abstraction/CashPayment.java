package objectOrientedProgramming.Abstraction;

public class CashPayment extends Payment {

    public CashPayment(double amount) {
        super(amount);
    }

    @Override
    public void pay() {
        System.out.println("Collecting cash payment of " + amount);
    }
}
