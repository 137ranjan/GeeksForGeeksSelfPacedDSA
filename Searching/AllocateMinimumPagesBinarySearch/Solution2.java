class Solution 
{
    //Function to find minimum number of pages.
    public static int findPages(int[]A,int N,int M)
    {
        //Your code here
        int sum=0;
	    //returning -1 if no. of books is less than no. of students.
	    if(N<M)
	        return -1;
	    
	    for(int x:A)
	    sum+=x;
	    
	    //initializing start as 0 pages and end as total pages.
	    int start=0;
	    int end=sum;
	    int ans=1000000000;
	    
	    while(start<=end)
	    {
	        int mid=(start+end)/2;
	        //checking if it is possible to distribute books 
            //by using mid as current minimum.
	        if (isPossible(A, N, M, mid)) 
	        {
	            //if yes, then we find the minimum distribution.
                ans = ans<mid? ans:mid;
                
                //as we are finding minimum and books are sorted 
                //so reducing end as end = mid -1.
                end = mid - 1;
            }
            //if not possible means pages should be increased so
            //updating start = mid + 1.
            else 
            {
                start = mid + 1;
            }
	    }
	    //returning minimum number of pages.
	    return ans;
        
    }
    
    public static boolean isPossible(int arr[], int n, int m, int curMin)
	{
        int studentsRequired = 1;
        int curSum = 0;
        
        //iterating over all the books.
        for (int i = 0; i < n; i++)
        {
            //if current number of pages are greater than curMin, return false
            if (arr[i] > curMin) 
                return false;
                
            //counting number of students required to distribute curMin pages
            if (curSum + arr[i] > curMin) 
            {
                //incrementing student count and updating curSum.
                studentsRequired++;
                curSum = arr[i];
    
                //if students required becomes greater than given number 
                //of students, we return false.
                if (studentsRequired > m) return false;
            }
            //else updating curSum
            else 
            {
                curSum += arr[i];
            }
        }
        return true;
    }
};
