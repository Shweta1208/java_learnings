package exceptionHandling;

import java.sql.SQLException;
import java.util.Scanner;

public class practiceException {
    public static void main(String[] args) throws SQLException {
        try{
            int a = 10/0;
            System.out.println(a);
        } catch(ArithmeticException e){
            System.out.println("Arithmetic Exception occurred: " + e.getMessage());
        }catch(Exception e){
            System.out.println("Exception occurred: " + e.getMessage());
        }finally {
            System.out.println("The arithmetic operation task is done");
        }
        try{
            String name = null;
            System.out.println(name.length());
        }catch (NullPointerException e){
            System.out.println("Null Pointer Exception occurred: " + e.getMessage());
        }catch(Exception e){
            System.out.println("Exception occurred: " + e.getMessage());
        }
        // Multi-catch block
        try{
            String name = null;
            System.out.println(name.length());
        }catch (NullPointerException | ArrayIndexOutOfBoundsException | ArithmeticException e){
            System.out.println("Null Pointer Exception occurred: " + e.getMessage());
        }

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age < 0)
            throw new IllegalArgumentException("Age cannot be negative");
    }
}
