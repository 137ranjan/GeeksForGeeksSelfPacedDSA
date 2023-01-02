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
		System.out.println(largest(arr, 6));
	}
	
	private static int largest(int[] arr, int n){
	   int max = arr[0];
	   int pos = 0;
	   for (int i=1; i<n; i++ ){
	       if(arr[i] > max){
	           max = arr[i];
	           pos = i;
	       }
	   }
	   
	   return max;
	}
}
