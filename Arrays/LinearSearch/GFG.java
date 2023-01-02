/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
		int[] arr = {1,0,2,9,3,8,4,7,5,6};
		int x = 0;
		System.out.println(linearSearch(arr, arr.length, x));
	}
	
	private static int linearSearch(int[] a, int n, int x){
	    for (int i=0; i<n; i++ ){
	        if(a[i] == x){
	            return i+1;
	        }
	    }
	    return -1;
	}
}
