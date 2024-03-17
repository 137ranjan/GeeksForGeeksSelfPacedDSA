class Solution
{
    //Function to find the kth smallest element in the array.
    public static int kthSmallest(int arr[], int n, int k)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<k; i++){
            pq.add(arr[i]);
        }
        for(int i=k; i<n; i++){
            if(pq.peek() > arr[i]){
                pq.remove();
                pq.add(arr[i]);
            }
        }
        
        return pq.remove();
    }
}
