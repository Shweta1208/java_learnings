package exceptionHandling;

public class InsufficientFundException extends Exception {

    public InsufficientFundException(double amount) {
        super("You dont have enough money to withdraw stupid. Go and Earnnn. Your current balance is: " + amount);
    }
}
