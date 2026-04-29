package strings;

public class PalindromeCheck {

    public static boolean isPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    public static void isPalindrome2(String str){
        StringBuilder sb = new StringBuilder();
        for(int i =str.length()-1;i>=0;i--)
            sb.append(str.charAt(i));
        System.out.println(sb.toString());
        if(str.equals(sb.toString()))
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
    public static void main(String[] args) {
        String str = "dad";
        isPalindrome2(str);
    }
}
