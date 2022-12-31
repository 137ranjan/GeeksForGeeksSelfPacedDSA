class Solution
{
    static int fibonacci(int n)
    {
        // your code here
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
