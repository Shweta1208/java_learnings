package patterns;

public class Pattern4 {
    public static void printPatter(int n){
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n-1;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            for(int m=i;m<=n-1;m++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPatter(5);
    }
}
