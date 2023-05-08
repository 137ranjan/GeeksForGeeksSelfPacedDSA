import java.io.*;
import java.util.Map;
import java.util.HashMap;

class GFG {
	public static void main (String[] args) {
		String str = "abccb";
		int result = leftmostRepeating(str);
		System.out.println(result);
	}
	
	private static int leftmostRepeating(String str){
	    boolean[] visited = new boolean[256];
	    int res = -1;
	    for(int i=str.length() - 1; i >= 0; i--){
	        if(visited[str.charAt(i)]){
	            res = i;
	        } else{
	            visited[str.charAt(i)] = true;
	        }
	    }
	    
	    return res;
	}
}
