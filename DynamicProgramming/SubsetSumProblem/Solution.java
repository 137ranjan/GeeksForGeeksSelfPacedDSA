public class Solution {
	public static void main(String[] args) {
		int[] arr = { 2, 5, 3 };
		int sum = 5;
		System.out.println(countSubsets(arr, arr.length, sum));
		System.out.println(countSubsetsDP(arr, arr.length, sum));
	}

	private static int countSubsets(int[] arr, int n, int sum) {
		if (n == 0) {
			return (sum == 0) ? 1 : 0;
		}
		return countSubsets(arr, n - 1, sum) + countSubsets(arr, n - 1, sum - arr[n - 1]);
	}

	private static int countSubsetsDP(int[] arr, int n, int sum) {
		int[][] dp = new int[n + 1][sum + 1];
		for (int i = 0; i <= n; i++) {
			dp[i][0] = 1;
		}
		for (int j = 1; j <= sum; j++) {
			dp[0][j] = 0;
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sum; j++) {
				if (j < arr[i - 1]) {
					dp[i][j] = dp[i - 1][j];
				} else {
					dp[i][j] = dp[i - 1][j] + dp[i][j - arr[i - 1]];
				}
			}
		}

		return dp[n][sum];
	}
}