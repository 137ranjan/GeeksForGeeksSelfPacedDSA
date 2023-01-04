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
        // int [] arr = {40,50,50,50};
		for(int i=0; i<arr.length; i++){
		    System.out.print(arr[i]+" ");
		}
		System.out.println("\n");
		frequency(arr);
    }
    
    private static void frequency(int[] arr){
	    int n = arr.length;
	    int item = arr[0];
	    int count = 0;
	    for (int i=0; i<n; i++){
	        if(item == arr[i]){
	            count++;
	        }else{
	            System.out.println(item+" "+count);
	            item = arr[i];
	            count = 1;
	        }
	       
	    }
	    System.out.println(item+" "+count);
	}
}
