class Solution
{
    // Complete the function
    // n: Input n
    // Return True if the given number is a lucky number else return False
    public static boolean isLucky(int n)
    {
        // Your code here
        return check(n, 2);
    }
    
    public static boolean check(int n,int counter)
    {
        if(counter<=n){
            if(n%counter==0)
                return false;
		    // calculate next position of input number
		    n=n-n/counter;
		    counter++;
		    // make recursive call with updated counter 
		    // and position return check(n, counter);
		    return check(n, counter);
        }    
       	else
       		return true;
    }
}
