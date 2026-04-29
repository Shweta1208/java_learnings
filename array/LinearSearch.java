package array;

public class LinearSearch {
    public  static void search(int arr[], int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target)
                System.out.println(arr[i] + " is found at index "+ i);
            else if (i>=arr.length) {
                System.out.println(arr[i] + " is not found at index ");
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {56,78,92,56,89,3,77,100,67};
        int target = 3;
        search(numbers,target);
    }
}
