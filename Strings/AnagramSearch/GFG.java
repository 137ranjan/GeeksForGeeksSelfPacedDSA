/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
	    String s1 = "geeksforgeeks";
	    String s2 = "frog";
	    
	    System.out.println(isPresent(s1, s2));
		
	}
	
	private static boolean isPresent(String txt, String pat){
	    int[] ct = new int[256];
	    int[] cp = new int[256];
	    
	    for(int i=0; i<pat.length(); i++){
	        ct[txt.charAt(i)]++;
	        cp[pat.charAt(i)]++;
	    }
	    
	    for(int i=pat.length(); i< txt.length(); i++ ){
	        if(areSame(cp, ct)){
	            return true;
	        }
	        ct[txt.charAt(i)]++;
	        ct[txt.charAt(i-pat.length())]--;
	    }
	    
	    return false;
	}
	
	private static boolean areSame(int[] cp, int[] ct){
	    for(int i=0; i<cp.length; i++){
	        if(cp[i] != ct[i]){
	            return false;
	        }
	    }
	    
	    return true;
	}
	
}
