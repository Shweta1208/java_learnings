package Streamsss;

import java.util.Arrays;
import java.util.OptionalInt;

public class secondSmallest {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        Arrays.sort(arr);
        OptionalInt secondSmallestNum = Arrays.stream(arr).sorted().distinct().skip(1).findFirst();
        System.out.println(secondSmallestNum.getAsInt());
    }
}
