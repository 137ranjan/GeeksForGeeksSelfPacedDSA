class Solution {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 10, 30 };
        System.out.println(minPages(arr, arr.length, 2));
        System.out.println(minPagesDP(arr, arr.length, 2));
    }

    // Recursive solution
    private static int minPages(int[] arr, int n, int k) {
        if (k == 1) {
            return sum(arr, 0, n - 1);
        }
        if (n == 1) {
            return arr[0];
        }
        int res = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            res = Math.min(res, Math.max(minPages(arr, i, k - 1), sum(arr, i, n - 1)));
        }
        return res;
    }

    private static int sum(int[] arr, int b, int e) {
        int s = 0;
        for (int i = b; i <= e; i++) {
            s += arr[i];
        }
        return s;
    }

    // DP Solution
    private static int minPagesDP(int[] arr, int n, int k) {
        int[][] dp = new int[k + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            dp[1][i] = sum(arr, 0, i - 1);
        }
        for (int i = 1; i <= k; i++) {
            dp[i][1] = arr[0];
        }
        for (int i = 2; i <= k; i++) {
            for (int j = 2; j <= n; j++) {
                int res = Integer.MAX_VALUE;
                for (int p = 1; p < j; p++) {
                    res = Math.min(res, Math.max(dp[i - 1][p], sum(arr, p, j - 1)));
                }
                dp[i][j] = res;
            }
        }
        return dp[k][n];
    }
}