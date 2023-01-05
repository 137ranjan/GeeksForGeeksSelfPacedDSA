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
		System.out.println(maxOnes(arr));
    }
    
    private static int maxOnes(int[] arr){
        int n = arr.length;
        int count = 0;
        int maxCount = 0;
        for(int i=0; i < n; i++){
            if(arr[i] == 0){
                count=0;  
            }else{
               count++;
               maxCount = Math.max(maxCount,count);
            }
        }
        
        return maxCount;
    }
}
