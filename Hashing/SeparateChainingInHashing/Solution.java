class Solution{

    //Function to insert elements of array in the hashTable avoiding collisions.
    public ArrayList<ArrayList<Integer>> separateChaining(int arr[], int n, int hashSize)
    {
        ArrayList<ArrayList<Integer>> hashTable = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<hashSize; i++){
            hashTable.add(new ArrayList<Integer>());
        }
        
        for(int i=0; i<n; i++){
            int h = arr[i]%hashSize;
            hashTable.get(h).add(arr[i]);
        }
        
        return hashTable;
    }
}
