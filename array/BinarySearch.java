package array;

import java.util.Arrays;

public class BinarySearch {
    public  static void bSearch(int arr[], int target){
        int mid= arr.length/2;
        sort(arr);
        int start = 0;
        int end = arr.length -1;
        while(start <= end){
            if(arr[mid] == target){
                System.out.println(arr[mid] + " is found at index "+ mid);
                return;
            }
            else if(arr[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
            mid = (start + end)/2;
        }
        System.out.println(target + " is not found in the array");
    }

    public static void sort(int[] arr){
        int temp =0;
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){
                if(arr[i]>=arr[j])
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
            }
        }
        Arrays.sort(arr);
    }

    public static void main(String[] args) {
        int[] numbers = {56,78,92,56,89,3,77,100,67};
        int target = 3;
        bSearch(numbers,target);
    }
}
