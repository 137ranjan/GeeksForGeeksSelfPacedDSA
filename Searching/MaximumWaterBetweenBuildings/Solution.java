class Solution
{
    //Function to return the maximum water that can be stored.
    static int maxWater(int height[], int n) 
    { 
        //Your code here
        int max = 0; 

		//using two pointers that point at first and last building respectively.
		int i = 0, j = n - 1; 

		while (i < j) 
		{ 
		    //if height at index i is less than height at index j, updating 
    		//maximum water stored so far and incrementing i.
			if (height[i] < height[j]) 
			{ 
				max = Math.max(max, (j - i - 1) * height[i]); 
				i++; 
			} 
			//else if height at index i is more than height at index j,  
    		//updating maximum water stored so far and decrementing j.
			else if (height[j] < height[i]) 
			{ 
				max = Math.max(max, (j - i - 1) * height[j]); 
				j--; 
			} 
			//else updating maximum water stored so far and both pointers.
			else
			{ 
				max = Math.max(max, (j - i - 1) * height[i]); 
				i++; 
				j--; 
			} 
		} 
        //returning the result.
		return max; 
    } 

}
