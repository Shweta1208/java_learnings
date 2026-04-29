package patterns;

public class Pattern6 {
    public static void pattern6(int n){
        for(int i=1;i<=n;i++){
            for(int k=1;k<=i-1;k++){
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern6(5);
    }
}
