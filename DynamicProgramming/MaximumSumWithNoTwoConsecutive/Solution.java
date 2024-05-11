public class Solution {
    public static void main(String[] args) {
        int[] arr = { 10, 5, 15, 20 };
        System.out.println(maxSum(arr, arr.length));
        System.out.println(maxSumDP(arr, arr.length));
        System.out.println(maxSumDPSpaceOptimized(arr, arr.length));
    }

    // Recursive Solution
    private static int maxSum(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        } else if (n == 2) {
            return Math.max(arr[0], arr[1]);
        } else {
            return Math.max(maxSum(arr, n - 1), maxSum(arr, n - 2) + arr[n - 1]);
        }
    }

    // DP Solution
    private static int maxSumDP(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        int[] dp = new int[n + 1];
        dp[1] = arr[0];
        dp[2] = Math.max(arr[0], arr[1]);
        for (int i = 3; i <= n; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + arr[i - 1]);
        }
        return dp[n];
    }

    // DP Solution: Space Optimized
    private static int maxSumDPSpaceOptimized(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        int prev_prev = arr[0];
        int prev = Math.max(arr[0], arr[1]);
        int res = prev;
        for (int i = 3; i <= n; i++) {
            res = Math.max(prev, prev_prev + arr[i - 1]);
            prev_prev = prev;
            prev = res;
        }
        return res;
    }
}