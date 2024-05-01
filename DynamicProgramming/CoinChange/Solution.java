public class Solution {
    public static void main(String[] args) {
        int[] coins = { 2, 5, 3 };
        int n = 3;
        int s = 5;

        System.out.println(countWays(coins, n, s));
        System.out.println(countWaysDp(coins, n, s));
    }

    // Naive Recursive solution
    // Infinite number of each coin type is available
    // find the number of ways this sum can be paid using given coin types
    private static int countWays(int coins[], int n, int s) {
        if (s == 0)
            return 1;
        if (s < 0)
            return 0;
        if (n == 0)
            return 0;
        return countWays(coins, n, s - coins[n - 1]) + countWays(coins, n - 1, s);
    }

    // Dp solution
    private static int countWaysDp(int coins[], int n, int s) {
        int[][] dp = new int[n + 1][s + 1];
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }
        for (int j = 0; j <= s; j++) {
            dp[0][j] = 0;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= s; j++) {
                if (coins[i - 1] > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - coins[i - 1]];
                }
            }
        }

        return dp[n][s];
    }
}