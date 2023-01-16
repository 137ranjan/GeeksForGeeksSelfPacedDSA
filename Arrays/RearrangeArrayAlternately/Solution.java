class Solution{
    
    // temp: input array
    // n: size of array
    //Function to rearrange  the array elements alternately.
    public static void rearrange(long arr[], int n){
        
        // Your code here
        if(n != 1){
            long[] arr2 = new long[n];
            for(int i=0, j=0, k = n-1; i<n-1; i+=2, j++, k--){
                arr2[i] = arr[k];
                arr2[i+1] = arr[j];
                // for(int l=0; l<n; l++){
                //     System.out.print(arr2[l]+" ");
                // }
                // System.out.print("\n");
            }
            if(n%2 != 0){
                arr2[n-1] = arr[n/2];
            }
            
            for(int i=0; i<n; i++){
                arr[i] = arr2[i];
            }
        }
        
        
    }
    
}
