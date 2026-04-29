package exceptionHandling;

public class BankAccount {
    private double amount;

    public BankAccount(double amount){
        this.amount=amount;
    }

    public double withDraw(double withDraw) throws Exception{
        if(withDraw <= amount){
            double balance = updateAmount(withDraw);
            System.out.println("WithDraw is successful. Current balance is: " + balance);
            return balance;
        }else{
            throw new InsufficientFundException(amount);
        }
    }

    public double updateAmount(double totalAmount){
        if(totalAmount>0){
            amount = amount -  totalAmount;
            return amount;
        }
        return amount;
    }

}
