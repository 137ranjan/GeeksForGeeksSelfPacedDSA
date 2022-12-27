/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
		System.out.println(maxPieces(9, 2, 2 , 2));
	}
	
	private static int maxPieces(int n, int a, int b, int c){
	    if(n == 0){
	        return 0;
	    }
	    if(n < 0){
	        return -1;
	    }
	    int x = maxPieces(n-a, a, b, c);
        int y = maxPieces(n-b, a, b, c);
        int z = maxPieces(n-c, a, b, c);
        int res =  Math.max(Math.max(x,y),z);
        
        if(res == -1){
            return -1;
        }
        
        return res + 1;
	}
}
