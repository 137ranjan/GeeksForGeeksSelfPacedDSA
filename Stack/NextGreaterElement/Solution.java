class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        long[] result = new long[n];
        ArrayDeque<Long> stack = new ArrayDeque<>();
        result[n-1] = -1;
        stack.push(arr[n-1]);
        
        for(int i=n-2; i>=0; i--){
            while(!stack.isEmpty() && stack.peek() <= arr[i]){
                stack.pop();
            }
            result[i] = stack.isEmpty()? -1: stack.peek();
            stack.push(arr[i]);
        }
        
        return result;
        
    } 
}
