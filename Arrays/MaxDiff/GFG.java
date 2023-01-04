/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
		int [] arr = {10,20,30};
		for(int i=0; i<arr.length; i++){
		    System.out.print(arr[i]+" ");
		}
		System.out.println("\n");
		System.out.println(maxDiff(arr));
	}
	
	private static int maxDiff(int[] arr){
	    int n = arr.length;
	    int res = arr[1]-arr[0];
	    int minVal = arr[0];
	    
	    for (int j=1; j<n ; j++){
	        if(arr[j] - minVal > res){
	            res = arr[j] - minVal;
	        }
	        
	        if(minVal > arr[j]){
	            minVal = arr[j];
	        }
	    }
	    
	    return res;
	}
	
}
