package objectOrientedProgramming.Abstraction;

public abstract class Payment {
    protected double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    // Abstract method
    public abstract void pay();

    // Concrete method
    public void showAmount() {
        System.out.println("Amount to be paid: " + amount);
    }
}
