public class Solution {
    public static void main(String[] args) {
        int[] coins = { 25, 10, 5 };
        System.out.println(getMin(coins, 3, 30));
        System.out.println(getMinDP(coins, 3, 30));
    }

    private static int getMin(int[] coins, int n, int val) {
        if (val == 0)
            return 0;
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (coins[i] <= val) {
                int subRes = getMin(coins, i, val - coins[i]);
                if (subRes != Integer.MAX_VALUE) {
                    res = Math.min(res, subRes + 1);
                }
            }
        }

        return res;
    }

    private static int getMinDP(int[] coins, int n, int val) {
        int[] dp = new int[val + 1];
        dp[0] = 0;
        for (int i = 1; i < val + 1; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        for (int i = 1; i <= val; i++) {
            for (int j = 0; j < n; j++) {
                if (coins[j] <= i) {
                    int subRes = dp[i - coins[j]];
                    if (subRes != Integer.MAX_VALUE) {
                        dp[i] = Math.min(dp[i], subRes + 1);
                    }
                }
            }
        }

        return dp[val];
    }
}