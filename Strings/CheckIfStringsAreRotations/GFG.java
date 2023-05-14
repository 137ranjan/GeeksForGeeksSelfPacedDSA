/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
	    String s1 = "ABAB";
	    String s2 = "ABBA";
	    
	    System.out.println(areRotations(s1, s2));
		
	}
	
	private static boolean areRotations(String s1, String s2){
	    if(s1.length() != s2.length()){
	        return false;
	    }
	    
	    return ((s1+s1).indexOf(s2) >= 0);
	}
	
}
