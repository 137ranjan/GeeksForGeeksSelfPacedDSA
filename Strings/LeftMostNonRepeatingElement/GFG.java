import java.io.*;
import java.util.Arrays;

class GFG {
	public static void main (String[] args) {
		String str = "geeksforgeeks";
		int result = leftmostNonRepeating(str);
		System.out.println(result);
	}
	
	private static int leftmostNonRepeating(String str){
	    int[] fi = new int[256];
	    Arrays.fill(fi,-1);
	    for(int i=0; i < str.length(); i++){
	        if(fi[str.charAt(i)] == -1){
	            fi[str.charAt(i)] = i;
	        }
	        else{
	            fi[str.charAt(i)] = -2;
	        }
	    }
	    int res = Integer.MAX_VALUE;
	    for(int i=0; i< 256; i++){
	        if(fi[i] > 0){
	            res = Math.min(res, fi[i]);
	        }
	    }
	    
	    return (res == Integer.MAX_VALUE)? -1 : res;
	}
}
