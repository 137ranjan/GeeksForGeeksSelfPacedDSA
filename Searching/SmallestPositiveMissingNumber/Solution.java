class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        // Your code here
        int[] arr2 = new int[1000000];
        
        for(int i=0; i<size; i++){
            if(arr[i] > 0){
                arr2[arr[i]]++;
            }
        }
        int result = 0;
        for(int i=1; i< 1000000; i++){
            if(arr2[i] == 0){
                result = i;
                break;
            }
        }
        
        return result;
    }
}
