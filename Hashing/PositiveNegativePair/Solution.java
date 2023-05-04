class Solution
{
    //Function to return list containing all the pairs having both
    //negative and positive values of a number in the array.
    public static ArrayList<Integer>findPairs(int arr[], int n) 
    {
        ArrayList<Integer> resultList = new ArrayList<>();
    	Set<Integer> set = new HashSet<>();
    	for(int i=0; i<n; i++){
    	    if(set.contains(Math.abs(arr[i]))){
    	        resultList.add(-1*Math.abs(arr[i]));
    	        resultList.add(Math.abs(arr[i]));
    	    }else{
    	        set.add(Math.abs(arr[i]));
    	    }
    	}
    	return resultList;
    }
}
