package Manifest;

public class FindPrefix {
    static void main(String[] args) {
        System.out.println(prefixx());
    }

    public static String prefixx() {
        String[] str = {"flower","flow","flight"};
        String pre = str[0];
        for(String s : str){
            while(s.indexOf(pre)!=0){
                pre = pre.substring(0,pre.length()-1);
            }
        }
        if (pre.isEmpty()) return "";
        else return pre;
    }
}
