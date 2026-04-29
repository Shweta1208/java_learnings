package Manifest;

import static java.sql.Types.INTEGER;

public class MaximumSubArray {
    public static void main(String[] args){
        int[] arr = {2,4,1,7,5,9,6};
        int subArraySize = 3;
        int maxSubArray = maxSubArray(arr,subArraySize);
        System.out.println("Maximun sub array of size "+ subArraySize + " is: "+maxSubArray);
    }
    public static int maxSubArray(int[] arr, int subArraySize){
        int maxx = 0;
        for(int i=0;i<arr.length-subArraySize;i++){
            int current = 0;
            for(int j=i+1;j<subArraySize+i;j++){
                current=current+arr[j];
            }
            if(current>maxx){
                maxx=current;
            }
        }
        return maxx;
    }
}
