import java.io.*;
import java.lang.*;
import java.util.*;

class Solution 
{ 
    //Function to count maximum number of distinct smaller 
    //elements on right side of any array element.
    static int getMaxSmallerOnRight(int[] arr, int n)
    {
        int cnt = 0;
        
        //using set to count smaller elements on right side.
        TreeSet<Integer> tst = new TreeSet<Integer>();
        
        //iterating over the array elements.
        for(int i=n-1; i>=0; i--)
        {
            //inserting the array element in set.
            tst.add(arr[i]);
            
            //finding first element that is lower than arr[i] 
            //using lower_bound function.
        
            //finding the distance between above found element and the
            //beginning of the set using distance function.
            cnt = Integer.max(tst.headSet(arr[i]).size(), cnt);
        }
        //returning the list.
        return cnt;
    }
    
    //main function
    public static void main (String[] args) throws IOException 
    {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		
		while(t-->0)
		{
		    //taking inputs from user.
		    String inputLine[] = br.readLine().trim().split(" ");
		    int n = Integer.parseInt(inputLine[0]);
		    inputLine = br.readLine().trim().split(" ");
		    int[] arr = new int[n];
		    for(int i=0; i<n; i++){
		        arr[i]=Integer.parseInt(inputLine[i]);
		    }
		    
		    //printing the result.
		    System.out.println(getMaxSmallerOnRight(arr, n));
		}
	}
} 
