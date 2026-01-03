package objectOrientedProgramming.Abstraction;

public class CreditCardPayment extends Payment {

    public CreditCardPayment(double amount) {
        super(amount);
    }

    @Override
    public void pay() {
        System.out.println("Processing credit card payment of " + amount);
    }
}
