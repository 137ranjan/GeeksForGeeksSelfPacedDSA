class Solution {
    public static void main(String[] args) {
        String s = "geek";
        int i = 0;
        int j = 3;
        System.out.println(palPart(s, i, j));
        System.out.println(palPartDP(s));
    }

    private static boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    // Recursive solution
    private static int palPart(String s, int i, int j) {
        if (isPalindrome(s, i, j)) {
            return 0;
        }
        int res = Integer.MAX_VALUE;
        for (int k = i; k < j; k++) {
            res = Math.min(res, 1 + palPart(s, i, k) + palPart(s, k + 1, j));
        }
        return res;
    }

    // DP solution
    private static int palPartDP(String str) {
        int n = str.length();
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            dp[i][i] = 0;
        }
        for (int gap = 1; gap < n; gap++) {
            for (int i = 0; i + gap < n; i++) {
                int j = i + gap;
                if (isPalindrome(str, i, j)) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = Integer.MAX_VALUE;
                    for (int k = i; k < j; k++) {
                        dp[i][j] = Math.min(dp[i][j], 1 + dp[i][k] + dp[k + 1][j]);
                    }
                }
            }
        }
        return dp[0][n - 1];
    }
}