public class Solution{
    public static void main(String[] args){
        int[] val = {10, 40, 30, 50};
        int[] wt = {5, 4, 6, 3};
        int w = 10;
        int n = wt.length;
        System.out.println(knapsack(w, wt, val, n));
    }

    private static int knapsack(int w, int[] wt, int[] val, int n){
        if(n == 0 || w == 0){
            return 0;
        }
        if(wt[n-1] > w){
            return knapsack(w, wt, val, n-1);
        }
        else{
            return Math.max(knapsack(w, wt, val, n-1), val[n-1]+knapsack(w-wt[n-1], wt, val, n-1));
        }
    }
}