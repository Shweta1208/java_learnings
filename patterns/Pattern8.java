package patterns;

public class Pattern8 {
    public static void main(String[] args) {
        pattern(5);
    }
//    * * * * *
//      * * *
//        *
    public static void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int k=1;k<=(i-1);k++){
                System.out.print(" ");
            }
            for(int j=0;j<2*(n-i)+1;j++){
                System.out.print("*");
            }
            for(int k=1;k<=(i-1);k++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
