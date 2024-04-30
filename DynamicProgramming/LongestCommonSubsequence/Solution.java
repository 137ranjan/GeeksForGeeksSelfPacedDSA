public class Solution {
    public static void main(String[] args) {
        String s1 = "AXYZ";
        String s2 = "BAZ";
        int result = lcs(s1, s2, s1.length(), s2.length());
        System.out.println(result);
        int[][] memo = new int[s1.length() + 1][s2.length() + 1];
        for (int i = 0; i < memo.length; i++) {
            for (int j = 0; j < memo[0].length; j++) {
                memo[i][j] = -1;
            }
        }
        int result2 = lcsMemoization(s1, s2, s1.length(), s2.length(), memo);
        System.out.println(result2);
        int result3 = lcsTabulation(s1, s2);
        System.out.println(result3);

    }

    /*
     * Naive Recursive Solution
     */
    private static int lcs(String s1, String s2, int m, int n) {
        if (m == 0 || n == 0) {
            return 0;
        }
        if (s1.charAt(m - 1) == s2.charAt(n - 1)) {
            return 1 + lcs(s1, s2, m - 1, n - 1);
        } else {
            return Math.max(lcs(s1, s2, m - 1, n), lcs(s1, s2, m, n - 1));
        }
    }

    /*
     * Memoization solution
     */
    private static int lcsMemoization(String s1, String s2, int m, int n, int[][] memo) {
        if (memo[m][n] != -1) {
            return memo[m][n];
        }
        if (m == 0 || n == 0) {
            memo[m][n] = 0;
        } else if (s1.charAt(m - 1) == s2.charAt(n - 1)) {
            memo[m][n] = 1 + lcsMemoization(s1, s2, m - 1, n - 1, memo);
        } else {
            memo[m][n] = Math.max(lcsMemoization(s1, s2, m - 1, n, memo), lcsMemoization(s1, s2, m, n - 1, memo));
        }
        return memo[m][n];
    }

    /*
     * Tabulation Solution
     */
    private static int lcsTabulation(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            dp[i][0] = 0;
        }
        for (int j = 0; j <= n; j++) {
            dp[0][j] = 0;
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[m][n];
    }
}