package exceptionHandling.customException;

public class Bank {
    int balance;
    public Bank(int balance){
        this.balance = balance;
    }

    public void withdraw(int amount) throws CustomBankException{
        if (amount<0){
            throw new CustomBankException("Withdrawal Amount cannot be negative");
        }
        else if (amount>balance){
            throw new CustomBankException("Not enough balance");
        }

        balance-=amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }
}
