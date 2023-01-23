import java.io.*;

class GFG {
	public static void main (String[] args) {
		int[] arr = {10, 20, 30, 40, 50, 60};
		int n = arr.length;
		int x = 55;
		System.out.println(binarySearch(arr, n, x));
	}
	
	private static int binarySearch(int[] arr, int n, int x){
	    int high = n - 1;
	    int low = 0;
	    
	    while(low <= high){
	        int mid = (low + high)/2;
	        if(arr[mid] == x){
	            return mid;
	        }else if(arr[mid] > x){
	            high = mid - 1;
	        }else{
	            low = mid + 1;
	        }
	    }
	    return -1;
	}
}
