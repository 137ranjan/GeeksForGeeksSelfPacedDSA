/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
		int [] arr = new int[10];
		arr[0] = 1;
		arr[1] = 3;
		arr[2] = 7;
		arr[3] = 8;
		arr[4] = 9;
		arr[5] = 18;
		int x = 7;
		System.out.println(delete(arr, 6, x));
	}
	
	private static int delete(int[] arr, int n, int x){
	   int i;
	   for (i=0; i<n; i++ ){
	       if(arr[i] == x){
	           break;
	       }
	   }
	   if(i == n){
	       return n;
	   }
	   for(int j=i; j< n-1; j++){
	       arr[i] = arr[i+1];
	   }
	   
	   return n-1;
	}
}
