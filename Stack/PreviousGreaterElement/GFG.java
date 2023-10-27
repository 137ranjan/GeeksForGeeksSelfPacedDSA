/*package whatever //do not write package name here */

import java.util.ArrayDeque;
    
class GFG {
    public static void main (String[] args) {
        int[] arr = {20,30,10,5,15};
        int[] result = previousGreatest(arr);
        for(int i=0; i<result.length; i++)
            System.out.print(result[i]+" ");
	}
	
	private static int[] previousGreatest(int[] arr){
	    ArrayDeque<Integer> stack = new ArrayDeque<>();
	    int[] result = new int[arr.length];
	    stack.push(arr[0]);
	    result[0] = -1;
	    for(int i=1; i<arr.length; i++){
	        while(!stack.isEmpty() && stack.peek() <= arr[i]){
	            stack.pop();
	        }
	        result[i] = stack.isEmpty()? -1 : stack.peek();
	        stack.push(arr[i]);
	    }
	    
	    return result;
	}
}
