package objectOrientedProgramming.Abstraction;
// multiple abstract classes are implemented here for payment having a common method pay
public class Main {
    public static void main(String[] args) {

        Payment p1 = new CreditCardPayment(1500);
        Payment p2 = new UPIPayment(800);
        Payment p3 = new CashPayment(500);

        p1.showAmount();
        p1.pay();

        System.out.println();

        p2.showAmount();
        p2.pay();

        System.out.println();

        p3.showAmount();
        p3.pay();
    }
}
