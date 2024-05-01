public class Solution {
    public static void main(String[] args) {
        String s1 = "SATURDAY";
        String s2 = "SUNDAY";
        int m = s1.length();
        int n = s2.length();
        System.out.println(editDistance(s1, s2, m, n));
        System.out.println(editDistanceDP(s1, s2, m, n));
    }

    // Edit Distance recursive solution
    private static int editDistance(String s1, String s2, int m, int n) {
        if (m == 0)
            return n;
        if (n == 0)
            return m;
        // when last charcter is same
        if (s1.charAt(m - 1) == s2.charAt(n - 1)) {
            return editDistance(s1, s2, m - 1, n - 1);
        } else {
            // call for insert, then delete, then replace
            return 1 + Math.min(editDistance(s1, s2, m, n - 1),
                    Math.min(editDistance(s1, s2, m - 1, n),
                            editDistance(s1, s2, m - 1, n - 1)));
        }
    }

    private static int editDistanceDP(String s1, String s2, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            dp[i][0] = i;
        }
        for (int j = 0; j <= n; j++) {
            dp[0][j] = j;
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(dp[i][j - 1], Math.min(dp[i - 1][j], dp[i - 1][j - 1]));
                }
            }
        }
        return dp[m][n];
    }
}