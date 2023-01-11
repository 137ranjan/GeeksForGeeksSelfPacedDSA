import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        int A[] = { 100, 180, 260, 310, 40, 535, 695 };
        // int A[] = {4,2,2,2,4};
        int n = A.length;
        System.out.println(stockBuySell(A, n));
    }

    private static ArrayList<ArrayList<Integer>> stockBuySell(int A[], int n) {

        ArrayList<ArrayList<Integer>> finalResult = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> buy = new ArrayList<Integer>();
        ArrayList<Integer> sell = new ArrayList<Integer>();
        
        if(A[0] < A[1]){
            buy.add(0);
        }
        
        for(int i=1; i<n-1; i++){
            if(A[i]<A[i+1] && A[i] <= A[i-1]){
                buy.add(i);
            }else if(A[i] >= A[i+1] && A[i] > A[i-1]){
                sell.add(i);
            }
        }
        if(A[n-2] < A[n-1]){
            sell.add(n-1);
        }
        // System.out.println(buy);
        // System.out.println(sell);

        
        for (int i = 0; i < buy.size(); i++) {
            ArrayList<Integer> result = new ArrayList<Integer>();
            result.add(buy.get(i));
            result.add(sell.get(i));
            finalResult.add(result);
            
        }

        return finalResult;

    }
}