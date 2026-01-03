package multithreading;
// A bank will have deposit and withdraw method which can be called by multiple threads
public class BankAccount {

    private int balance;
    private volatile boolean active = true; // visibility across threads

    public BankAccount(int balance) {
        this.balance = balance;
    }

    // synchronized METHOD
    public synchronized void deposit(int amount) {
        if (!active) {
            System.out.println("Account inactive. Deposit denied.");
            return;
        }

        balance += amount;
        System.out.println(Thread.currentThread().getName()
                + " deposited " + amount
                + ", balance = " + balance);
    }

    // synchronized BLOCK
    public void withdraw(int amount) {
        if (!active) {
            System.out.println("Account inactive. Withdrawal denied.");
            return;
        }

        synchronized (this) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println(Thread.currentThread().getName()
                        + " withdrew " + amount
                        + ", balance = " + balance);
            } else {
                System.out.println(Thread.currentThread().getName()
                        + " tried to withdraw " + amount
                        + " but insufficient balance");
            }
        }
    }

    public int getBalance() {
        return balance;
    }

    public void closeAccount() {
        active = false; // volatile ensures all threads see this change
        System.out.println("Account has been closed");
    }
}
