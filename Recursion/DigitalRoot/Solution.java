class Solution
{
    // complete the function
    public static int digitalRoot(int n)
    {
        // add your code here
        if(n == 0){
            return 0;
        }
        int sum = n%10 + digitalRoot(n/10);
        if(  (sum/ 10) > 0){
            return digitalRoot(sum);
        }else{
            return sum;
        }
        
    }
}
