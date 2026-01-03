package objectOrientedProgramming.Abstraction;

public class UPIPayment extends Payment {

    public UPIPayment(double amount) {
        super(amount);
    }

    @Override
    public void pay() {
        System.out.println("Processing UPI payment of " + amount);
    }
}
