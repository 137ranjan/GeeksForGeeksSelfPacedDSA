class Solution 
{
    //Function to find maximum of minimums of every window size.
    static int[] maxOfMin(int[] arr, int n) 
    {
        Stack<Integer> stack = new Stack<>();
        
        int[] left = new int[n+1];
        int[] right = new int[n+1];
        
        for(int i=0; i<n; i++){
            left[i] = -1;
            right[i] = n;
        }
        
        for(int i=0; i<n; i++){
            while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                left[i] = stack.peek();
            }
            stack.push(i);
        }
        while(!stack.isEmpty()){
            stack.pop();
        }
        for(int i=n-1; i>=0; i--){
            while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                right[i] = stack.peek();
            }
            stack.push(i);
        }
        
        int ans[] = new int[n+1];
        for(int i=0; i< n; i++){
            int len = right[i] - left[i] - 1;
            ans[len] = Math.max(ans[len],arr[i]);
        }
        
        for(int i=n-1; i>=0; i--){
            ans[i] = Math.max(ans[i], ans[i+1]);
        }
        int[] returnValue = new int[n];
        for(int i=1; i<=n; i++){
            returnValue[i-1] = ans[i];
        }
        return returnValue;
        
    }
}
