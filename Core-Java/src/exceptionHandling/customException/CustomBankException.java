package exceptionHandling.customException;

public class CustomBankException extends Exception{
    public CustomBankException(String message) {
        super(message);
    }
}
