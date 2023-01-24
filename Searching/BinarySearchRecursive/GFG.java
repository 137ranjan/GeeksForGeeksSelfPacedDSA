import java.io.*;

class GFG {
	public static void main (String[] args) {
		int[] arr = {10, 20, 30, 40, 50, 60};
		int n = arr.length;
		int x = 50;
		System.out.println(binarySearch(arr, 0, n - 1,x));
	}
	
	private static int binarySearch(int[] arr, int low, int high, int x){
	    if(low > high){
	        return -1;
	    }
	    int mid = (low + high)/2;
	    if(arr[mid] == x){
	        return mid;
	    }else if(arr[mid] > x){
	        return binarySearch(arr, low, mid - 1, x);
	    }else{
	        return binarySearch(arr, mid + 1, high, x);
	    }
	}
}
