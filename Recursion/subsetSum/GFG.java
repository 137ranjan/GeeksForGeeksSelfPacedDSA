/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
	    int[] arr = {10, 20, 15};
	    int sum = 25;
	    int n = arr.length;
	
		System.out.println(countSubsets(arr, n, sum));
	}
	
	private static int countSubsets(int[] arr, int n, int sum){
	    if(n == 0){
	        if(sum == 0){
	            return 1;
	        }else{
	            return 0;
	        }
	    }
	    
	    return countSubsets(arr, n-1, sum) + countSubsets(arr, n-1, sum - arr[n-1]);
	}
	
}
