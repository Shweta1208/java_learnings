package dp;

public class Knapsack {

    public static int knapsack(int index, int weight, int[] value, int[] weights){
        if(index ==0){
            if(weights[0] <= weight){
                return value[0];
            } else return 0;
        }
        int notTake = knapsack(index - 1, weight, value, weights);
        int take = Integer.MIN_VALUE;
        if(weights[index] <= weight){
            take = value[index]+ knapsack(index-1,weight-weights[index],value,weights);
        }
        return Math.max(notTake,take);
    }

    public static void main(String[] args) {
        int[] wt ={ 2,4,7};
        int[] val = {40,70,100};
        int w = 7;
        int n = wt.length;
        System.out.println(knapsack(n-1,w,val,wt));
    }
}
