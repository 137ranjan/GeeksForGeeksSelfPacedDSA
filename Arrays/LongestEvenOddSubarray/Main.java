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
		System.out.println(maxLengthEvenOddSubArr(arr));
    }
    
    private static int maxLengthEvenOddSubArr(int[] arr){
        int n = arr.length;
        int maxCount = 1;
        int currCount = 1;
        for(int i=1; i<n; i++){
            if( ((arr[i]%2 == 0) && (arr[i-1]%2 !=0)) || ((arr[i]%2 != 0) && (arr[i-1]%2 == 0)) ){
                currCount++;
                maxCount = Math.max(maxCount,currCount);
            }else{
                currCount = 1;
            }
        }
        return maxCount;
    }
}
