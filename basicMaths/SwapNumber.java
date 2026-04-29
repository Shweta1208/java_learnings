package basicMaths;

public class SwapNumber {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        System.out.println("Before Swap: a = " + a + ", b = " + b);
        // Swapping without using a temporary variable
        a = a+ b;
        b = a -b;
        a = a -b;
        System.out.println("After Swap: a = " + a + ", b = " + b);

    }
}
