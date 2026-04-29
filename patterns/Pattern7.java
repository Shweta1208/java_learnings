package patterns;

import java.util.Scanner;

public class Pattern7 {
    public static void pattern7(int n){
        for(int i=n;i>=1;i--){
            // For Spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // For Stars
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            // For Spaces
            for(int m=1;m<=n-i;m++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of rows: ");
//        int rows = sc.nextInt();
//        System.out.println("Pattern 7 : Exited YES OR NO");
//        String bool = sc.next();
        pattern7(10);
    }
}
