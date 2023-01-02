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
		int x = 0;
		System.out.println(insert(arr, 6, x, 10, 4));
	}
	
	private static int insert(int[] a, int n, int x, int cap, int pos){
	    if(n == cap){
	        return n;
	    }
	    int idx = pos-1;
	    for (int i=n-1; i>=idx; i-- ){
	        a[i+1] = a[i];
	    }
	    a[idx] = x;

	    return n+1;
	}
}
