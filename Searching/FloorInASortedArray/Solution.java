//Floor in a Sorted Array
class Solution{
    
    // Function to find floor of x
    // arr: input array
    // n is the size of array
    static int findFloor(long arr[], int n, long x)
    {
        int low = 0;
        int high = n - 1;
        int mid = (low + high)/2;
        int floor = 0;
        boolean floorFlag = false;
        
        while(low <= high){
            if(arr[mid] == x){
                return mid;
            }else if(arr[mid] > x){
                
                high = mid - 1;
                mid = (low + high)/2;
            }
            else{
                
                floor = mid;
                floorFlag = true;
                low = mid + 1;
                mid = (low + high)/2;
            }
        }
        if(floorFlag == true){
            return floor;
        }
        return -1;
        
    }
