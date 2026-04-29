package Manifest;

public class FactorialAgain {
    public static int fact(int n){
        if(n<=0)
            return 1;
        else
            return n*fact(n-1);
    }

    public static int factLoop(int n){
        int res = 1;
        for(int i=1;i<=n;i++){
            res*=i;
        }
        return res;
    }
    static void main() {
        int n = 5;
        System.out.println("Factorial of "+n+" is "+fact(n));
        System.out.println("Factorial of "+n+" is "+factLoop(n));
    }
}
