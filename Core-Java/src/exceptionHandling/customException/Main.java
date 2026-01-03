package exceptionHandling.customException;
// We made a customBankException

public class Main {

    public static void main(String[] args) {

        Bank account = new Bank(5000);

        try {
            account.withdraw(7000);
        } catch (CustomBankException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }
    }
}
