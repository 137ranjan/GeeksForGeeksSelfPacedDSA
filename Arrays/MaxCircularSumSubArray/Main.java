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
		System.out.println(maxCircularSubArrSum(arr));
    }
    
    private static int maxCircularSubArrSum(int[] arr){
        int n = arr.length;
        int maxNormal = normalMaxSubArrSum(arr);
        if(maxNormal < 0){
            return maxNormal;
        }
        int arrSum = 0;
        for(int i=0; i<n; i++){
            arrSum += arr[i];
            arr[i] = -arr[i];
        }
        int maxCircular = arrSum + normalMaxSubArrSum(arr);
        
        return Math.max(maxNormal,maxCircular);
    }
    
    private static int normalMaxSubArrSum(int [] arr){
        int n = arr.length;
        int res = arr[0], maxEnding= arr[0];
        for(int i=1; i<n; i++){
            maxEnding = Math.max(arr[i], maxEnding + arr[i]);
            res = Math.max(maxEnding, res);
        }
        return res;
    }
}
