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
	System.out.println(getWater(arr));
    }
    
    private static int getWater(int[] arr){
        int n = arr.length;
        int result = 0;
	int[] lMaxArr = new int[n];
        int[] rMaxArr = new int[n];
        
        lMaxArr[0] = arr[0];
        for(int i=1; i<n; i++){
            lMaxArr[i] = (arr[i] > lMaxArr[i-1]) ? arr[i] : lMaxArr[i-1];
        }
        
        rMaxArr[n-1] = arr[n-1];
        for(int i = n - 2; i >= 0; i--){
            rMaxArr[i] = (arr[i] > rMaxArr[i+1]) ? arr[i] : rMaxArr[i+1];
        }
        
        for(int i=1; i < n-1; i++){
            int temp = (lMaxArr[i] < rMaxArr[i]) ? lMaxArr[i] : rMaxArr[i];
            result = result + temp - arr[i];
        }
        
        return result;
    }
}
