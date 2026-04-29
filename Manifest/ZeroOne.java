package Manifest;

import java.util.Arrays;

public class ZeroOne {
    static void main() {
        int[] zeroOne = {0,1,0,1,1,0,0,1};
        int len = zeroOne.length;
        int zeroCount = 0;
        for(int i : zeroOne){
            if(i == 0)
                zeroCount++;
        }
        int oneCount = len - zeroCount;
        for(int i=0;i<len;i++) {
            if(i>=zeroCount)
                zeroOne[i] = 1;
            else
                zeroOne[i] = 0;
        }
        System.out.println(Arrays.toString(zeroOne));
    }

}
