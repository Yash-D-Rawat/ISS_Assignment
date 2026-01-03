package multithreading;


public class BankTask implements Runnable {

    private BankAccount account;

    public BankTask(BankAccount account) {
        this.account = account;
    }

    @Override
    public void run() {

        // local variable → thread-safe
        int transactionAmount = 100;

        account.deposit(transactionAmount);
        account.withdraw(transactionAmount / 2);
    }
}
