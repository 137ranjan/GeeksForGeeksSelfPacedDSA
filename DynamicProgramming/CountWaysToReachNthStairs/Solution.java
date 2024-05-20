/*
*There are n stairs, a person standing at the bottom wants to reach the top. 
*The person can climb either 1 stair or 2 stairs at a time. 
*Count the number of ways, the person can reach the top (order does matter).
*/
class Solution{
    //Function to count number of ways to reach the nth stair.
    int countWays(int n){
        if(n == 1){
            return 1;
        }
        int mod = 1000000007;
        int prev1 = 1;
        int prev2 = 1;
        int curr = 0;
        for(int i=2; i<=n; i++){
            curr = (prev1 + prev2)%mod;
            prev1 = prev2;
            prev2 = curr;
        }
        return curr;
    }
}
