class Solution
{
    // arr[]: input array
    // n: size of array
    
    //Function to return the count of non-repeated elements in the array.
    static long countNonRepeated(int arr[], int n)
    {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0) + 1);
        }
        int count = 0;
        for(int i: map.keySet()){
            if(map.get(i) == 1){
                count++;
            }
        }
        return count;
    }
