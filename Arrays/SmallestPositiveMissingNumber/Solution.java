class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        // Your code here
        int[] numArray = new int[1000000];
        int res = 0;
        for(int i=0; i< size; i++){
            if(arr[i] > 0){
                numArray[arr[i]]++;
            }
            
        }
        for(int i=1; i<1000000; i++){
            if(numArray[i] == 0){
                res = i;
                break;
            }
        }
        
        return res;
    }
}
