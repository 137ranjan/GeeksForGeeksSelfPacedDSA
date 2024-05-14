public class Solution {
    public static void main(String[] args) {
        int[] arr = { 20, 10, 30, 40 };
        // int[] arr = { 2, 1, 3, 4 };
        System.out.println(mChain(arr, 0, 3));
        System.out.println(mChainDP(arr, arr.length));
    }

    // Recursive solution
    private static int mChain(int[] arr, int i, int j) {
        if (i + 1 == j) {
            return 0;
        }
        int res = Integer.MAX_VALUE;
        for (int k = i + 1; k < j; k++) {
            res = Math.min(res, mChain(arr, i, k) + mChain(arr, k, j) + arr[i] * arr[j] * arr[k]);
        }

        return res;
    }

    // DP Solution
    private static int mChainDP(int[] arr, int n) {
        int[][] dp = new int[n][n];
        for (int i = 0; i < n - 1; i++) {
            dp[i][i + 1] = 0;
        }
        for (int gap = 2; gap < n; gap++) {
            for (int i = 0; i + gap < n; i++) {
                int j = i + gap;
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = i + 1; k < j; k++) {
                    dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[k][j] + arr[i] * arr[k] * arr[j]);
                }
            }
        }
        return dp[0][n - 1];
    }
}