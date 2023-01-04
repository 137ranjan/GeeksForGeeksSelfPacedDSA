// "static void main" must be defined in a public class.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = input.nextInt();
        }
		for(int i=0; i<arr.length; i++){
		    System.out.print(arr[i]+" ");
		}
		System.out.println("\n");
		System.out.println(maxProfit(arr,0,n));
    }
    
    private static int maxProfit(int[] price, int start, int end){
	    if(end <= start){
            return 0;
        }
        int profit=0; 
        for(int i = start; i < end; i++){
            for(int j=i+1; j < end; j++){
                if(price[j] > price[i]){
                    int currProfit = price[j] - price[i] 
                        + maxProfit(price, start, i-1)
                        + maxProfit(price, j+1, end);
                   if(profit < currProfit){
                       profit = currProfit;
                   }
                }
            }
        }
        
        return profit;
    }
}
