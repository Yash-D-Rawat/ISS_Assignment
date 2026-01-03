package multithreading;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BankExecutorDemo {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(500);
        // for executing threads through thread pool
        ExecutorService executor = Executors.newFixedThreadPool(3);

        System.out.println("Starting bank transactions...\n");

        for (int i = 1; i <= 5; i++) {
            executor.execute(new BankTask(account));
        }

        executor.shutdown();

        // simulate account closure after operations
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        account.closeAccount();
        System.out.println("Final Balance: " + account.getBalance());
    }
}