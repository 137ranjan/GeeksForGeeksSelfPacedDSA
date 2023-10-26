import java.util.ArrayDeque;
    
class GFG {
    public static void main (String[] args) {
        int[] arr = {30, 20, 25, 28, 27, 29};
        int[] result = stockSpan(arr);
        for(int i=0; i<result.length; i++)
            System.out.print(result[i]+" ");
	}
	
	private static int[] stockSpan(int[] arr){
	    int[] span = new int[arr.length];
	    ArrayDeque<Integer> stack = new ArrayDeque<>();
	    stack.push(0);
	    span[0] = 1;
	    for(int i=0; i<arr.length; i++){
	        while(!stack.isEmpty() && arr[stack.peek()] <= arr[i]){
	            stack.pop();
	        }
	        span[i] = stack.isEmpty()? i+1 : i-stack.peek();
	        stack.push(i);
	    }
	    return span;
	}
}
