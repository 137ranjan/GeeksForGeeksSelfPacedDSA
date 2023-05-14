/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
	    String txt = "ababcababaad";
	    String pat = "ababa";
		
		KMP(pat, txt);
	}
	
	private static void KMP(String pat, String txt){
	    int n = txt.length();
	    int m = pat.length();
	    
	    int[] lps = new int[m];
	    
	    fillLPS(pat, lps);
	    
	    int i = 0;
	    int j = 0;
	    while(i < n){
	        if(pat.charAt(j) == txt.charAt(i)){
	            i++;
	            j++;
	        }
	        if(j == m){
	            System.out.println(i-j);
	            j = lps[j - 1];
	        }
	        else if(i < n && pat.charAt(j) != txt.charAt(i)){
	            if(j == 0){
	                i++;
	            }
	            else{
	                j = lps[j - 1];
	            }
	        }
	    }
	}
	
	
	private static void fillLPS(String str, int[] lps){
	    int n = str.length();
	    int len = 0;
	    
	    lps[0] = 0;
	    int i=1;
	    
	    while(i < n){
	        if(str.charAt(i) == str.charAt(len)){
	            len++;
	            lps[i] = len;
	            i++;
	        }else{
	            if(len == 0){
	                lps[i] = 0;
	                i++;
	            }else{
	                len = lps[len - 1];
	            }
	        }
	    }
	}
}
