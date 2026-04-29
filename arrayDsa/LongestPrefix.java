package arrayDsa;

import java.util.Arrays;

public class LongestPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        if (prefix.isEmpty()) return "";
        else return prefix;
    }

    public static void main(String[] args) {
        LongestPrefix lp = new LongestPrefix();
        String[] strs = {"fly","float","flow"};
        System.out.println(Arrays.toString(strs));
        System.out.println(STR."The longest prefix \{lp.longestCommonPrefix(strs)}");
    }

}
