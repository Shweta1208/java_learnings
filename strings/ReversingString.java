package strings;

public class ReversingString {
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        String a = new String("Hello");
        a.startsWith("Hel");
        return reversed.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseString("Hello World"));
    }
}
