class Solution {
    //Function to reverse every sub-array group of size k.
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        // code here
        
        if( k >= n){
            for(int i=0, j=n-1; i < n/2; i++, j--){
                int temp = arr.get(i);
                arr.set(i,arr.get(j));
                arr.set(j,temp);
            }
            return;
        }
        int lp = 0;
        int rp = k-1;
        int count = n/k;
        while(count > 0){
            int i=lp;
            int j = rp;
            while(i < j){
                int temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
                
                i++;
                j--;
                
            }
            lp = lp + k;
            rp = rp + k;
            count--;
        }
        
        
        
        lp = n - n%k;
        rp = n - 1;
        
        while(lp < rp){
            int temp = arr.get(lp);
            arr.set(lp, arr.get(rp));
            arr.set(rp, temp);
                
            lp++;
            rp--;
        }
    }
}
