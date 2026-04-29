package Manifest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateArray {
    public static int[] remove(int[] arr){
        int len = arr.length;
        if(len ==0 || len ==1)
            return arr;
        Set<Integer> s = new HashSet<>();
        for(int i=0;i<len-1;i++){
            s.add(arr[i]);
        }
        return s.stream().mapToInt(Integer :: intValue).toArray();
    }

    public static int[] remove2(int[] arr){
        return Arrays.stream(arr).distinct().toArray();
    }

    public static void remove3(int[] arr){
        int len = arr.length;
        for(int i=0;i<len-1;i++){
            boolean dup = false;
            for(int j=i+1;j<len;j++){
                if(arr[i] == arr[j]) {
                    dup = true;
                    break;
                }
            }
            if(!dup)
                System.out.print(arr[i]+ ", ");
        }

    }
    static void main() {
        int[] arr = {1,2,3,4,5,6,7,8,9,1,2,3};
        System.out.println(Arrays.toString(remove(arr)));
        System.out.println(Arrays.toString(remove2(arr)));
        remove3(arr);
    }
}
