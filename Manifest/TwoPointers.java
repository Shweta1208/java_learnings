package Manifest;

import java.util.Arrays;

public class TwoPointers {
    // This consumes a lot of time, -> O(n square)
    public static int[] twoPointerBasic(int[] arr, int target){
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                if(arr[i]+arr[j] == target){
                    return new int[] {arr[i],arr[j]};
                }
            }
        }
        return null;
    }

    // It consumes less time, -> O(n) but the array should be sorted
    public static int[] twoPointerOptimal(int arr[], int target){
        Arrays.sort(arr);
        int left = 0; int right = arr.length-1;
        while(left < right){
            int current_sum = arr[left] + arr[right];
            if(current_sum == target){
                return new int[] {arr[left],arr[right]};
            }else if(current_sum > target){
                right--;
            }else{
                left++;
            }
        }
        return null;
    }


    public static void main(String[] str){
        int[] arr = {1,8,9,3,4,5,6,7};
        int target = 9;
        int[] twoSum = twoPointerBasic(arr,target);
        if(twoSum!=null){
            System.out.println("The sum of two numbers in the array that equals "+target+" is: "+twoSum[0]+" and "+twoSum[1]);
        }else{
            System.out.println("No two numbers in the array add up to "+target);
        }
        int twoSumOptimal[] = twoPointerOptimal(arr,target);
        if(twoSumOptimal!=null){
            System.out.println("The sum of two numbers in the array that equals "+target+" is: "+twoSum[0]+" and "+twoSum[1]);
        }else{
            System.out.println("No two numbers in the array add up to "+target);
        }
    }
}
