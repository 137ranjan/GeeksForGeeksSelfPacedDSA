class Solution
{
    public static void printAllSubsetsHelper(int arr[],int start, int n, 
        ArrayList<Integer> list, ArrayList <ArrayList <Integer>> res)
    { 
        //if all elements are iterated then we simply return.
        if(start>=n){
            return;
        }
        
        for(int i=start;i<n;)
        {
            list.add(arr[i]);
            //checking for duplicate elements.
            res.add (new ArrayList <Integer>(list));
            
            //calling function recursively for adding further subsets.
            printAllSubsetsHelper(arr, i+1, n, list, res);
            int j = i+1;
            while(j<n && arr[j]==arr[i]){
                j++;
            }
            i = j;
            list.remove(list.size()-1);
        }
        
    }
    
    //Function to find all possible unique subsets.
    public static ArrayList <ArrayList <Integer>> AllSubsets(int arr[], int n)
    {
        ArrayList <ArrayList <Integer>> res = new ArrayList <ArrayList <Integer>> (0);
        res.add(new ArrayList<>());
        printAllSubsetsHelper(arr,0,n,new ArrayList<Integer>(), res);
        
        //returning the result.
        return res;
    }
    
}
    
