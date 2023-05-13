public class GFG {
	public static void main (String[] args) {
	    String str = "AAABAAAAC";
	    int[] lps = new int[str.length()]; 
		fillLPS(str, lps);
		
		for(int x : lps){
		    System.out.print(x+" ");
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
