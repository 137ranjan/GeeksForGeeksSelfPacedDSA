// Left Index
class Solution{ 

    static int leftIndex(int N, int arr[], int X)
    {
       
       // Your code here
       int low = 0;
       int high = N - 1;
       int mid = (low + high)/2;
       int result = 0;
       boolean resultFlag = false;
       
       while(low <= high){
           if(arr[mid] == X){
               result = mid;
               resultFlag = true;
               high = mid - 1;
               mid = (low + high)/2;
           }else if(arr[mid] > X){
               high = mid - 1;
               mid = (low + high)/2;
           }else{
               low = mid + 1;
               mid = (low + high)/2;
           }
       }
       
       if(resultFlag == true){
           return result;
       }
       
       return -1;
       
   
    }
}
