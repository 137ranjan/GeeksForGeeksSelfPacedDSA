class Solution
{
    //Function to find the minimum element in sorted and rotated array.
    static int minNumber(int arr[], int low, int high)
    {
        // Your code here
        
        while(low < high){
            if(arr[low] <= arr[high]){
                return arr[low];
            }
            int mid = (low + high)/2;
            if(arr[mid] < arr[low]){
                high = mid;
            }else {
                low = mid + 1;
            }
        }
        
        return arr[low];
    }
}
