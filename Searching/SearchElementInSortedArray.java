//Searching an element in a sorted array
class Solution{
    static int searchInSorted(int arr[], int N, int K)
    {
        
        // Your code here
        int high = N - 1;
        int low = 0;
        int mid = (low + high)/2;
        
        while(low <= high){
            if(arr[mid] == K){
                return 1;
            }
            else if(arr[mid] > K){
                high = mid - 1;
                mid = (low + high)/2;
            }else{
                low = mid + 1;
                mid = (low + high)/2;
            }
        }
        
        return -1;
        
    }
}
