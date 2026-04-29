package exceptionHandling;

public class Banking {

   public static void main(String[] args) throws Exception {
       BankAccount bA = new BankAccount(1000);
       bA.withDraw(500);
       bA.withDraw(900);
   }
}
