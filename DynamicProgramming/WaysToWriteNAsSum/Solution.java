class Solution
{
    private static final int MOD = 1000000007;
    // function to count ways in which n can be
    // expressed as the sum of two or more integers
    int countWays(int N)
    {
        int[] dp = new int[N + 1];
        dp[0] = 1; // Base case: one way to partition 0

        // Fill dp array
        for (int i = 1; i < N; i++) { // we don't consider N itself
            for (int j = i; j <= N; j++) {
                dp[j] = (dp[j] + dp[j - i]) % MOD;
            }
        }

        return dp[N];
    }
    
    
}
