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
		System.out.println(maxSumSubArr(arr));
    }
    
    private static int maxSumSubArr(int[] arr){
        int n = arr.length;
        int res = arr[0];
        int maxSum = arr[0];
        for(int i=1; i<n; i++){
           maxSum = Math.max(maxSum + arr[i],arr[i]);
           res = Math.max(res, maxSum);
        }
        return maxSum;
    }
}
