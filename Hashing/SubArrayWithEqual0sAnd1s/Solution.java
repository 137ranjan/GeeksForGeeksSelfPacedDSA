class Solution
{
    //Function to count subarrays with 1s and 0s.
    static int countSubarrWithEqualZeroAndOne(int arr[], int n)
    {
        for(int i=0; i<n; i++){
            if(arr[i] == 0){
                arr[i] = -1;
            }
        }
        
        Map<Integer, Integer> map = new HashMap<>();
        int preSum = 0, count = 0;
        for(int i=0; i<n; i++){
            preSum += arr[i];
            if(preSum == 0){
                count++;
            }
            if(map.containsKey(preSum)){
                count += map.get(preSum);
            }
            if(map.containsKey(preSum)){
                int k = map.get(preSum);
                k++;
                map.put(preSum,k);
            }else{
                map.put(preSum, 1);
            }
        }
        
        return count;
    }
}
