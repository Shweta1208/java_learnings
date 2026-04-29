package basicMaths;

public class ReverseNum {
    public static void reverseNum(int num){
        int rev = 0;
        while(num > 0){
            rev = num%10;
            System.out.print(rev);
            num = num/10;
        }
        System.out.println(rev);
    }

    public static int reverseNum2(int num){
        int rev = 0;
        while(num > 0){
            int lastDigit = num%10;
            rev = rev * 10 + lastDigit;
            num = num/10;
        }
        return rev;
    }
    public static int reverseNegative(int num){
        int rev = 0;
        boolean isNegative = false;
        if(num < 0){
            isNegative = true;
            num = -num;
        }
        while(num > 0){
            int lastDigit = num%10;
            rev = rev * 10 + lastDigit;
            num = num/10;
        }
        if(isNegative){
            rev = -rev;
        }
        return rev;
    }

    public static void main(String[] args) {
        int num = 12345;
        reverseNum(num);
        System.out.println(reverseNum2(789234));
    }
}
