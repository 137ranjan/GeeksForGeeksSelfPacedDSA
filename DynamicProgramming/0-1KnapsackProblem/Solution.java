public class Solution {
    public static void main(String[] args) {
        int[] val = { 10, 40, 30, 50 };
        int[] wt = { 5, 4, 6, 3 };
        int w = 10;
        int n = wt.length;
        System.out.println(knapsack(w, wt, val, n));
        System.out.println(knapsackDP(w, wt, val, n));
    }

    private static int knapsack(int w, int[] wt, int[] val, int n) {
        if (n == 0 || w == 0) {
            return 0;
        }
        if (wt[n - 1] > w) {
            return knapsack(w, wt, val, n - 1);
        } else {
            return Math.max(knapsack(w, wt, val, n - 1), val[n - 1] + knapsack(w - wt[n - 1], wt, val, n - 1));
        }
    }

    private static int knapsackDP(int w, int[] wt, int[] val, int n) {
        int[][] dp = new int[n + 1][w + 1];
        for (int i = 0; i <= w; i++) {
            dp[0][i] = 0;
        }
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 0;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= w; j++) {
                if (wt[i - 1] > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.max(val[i - 1] + dp[i - 1][j - wt[i - 1]], dp[i - 1][j]);
                }
            }
        }

        return dp[n][w];

    }
}