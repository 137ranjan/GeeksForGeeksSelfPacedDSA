// Count More than n/k Occurences

class Solution 
{
    //Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int n, int k) 
    {
        // your code here,return the answer
        int[] arr2 = new int[1000000];
        
        for(int i=0; i<n; i++)
        {
            arr2[arr[i]]++;
        }
        
        int count = 0;
        for(int i=0; i<1000000; i++){
            if(arr2[i] > n/k){
                count++;
            }
        }
        return count;
    }
}
