public class Solution {
    public static void main(String[] args) {
        System.out.println(eggDrop(10, 2));
        System.out.println(eggDropDP(10, 2));
    }

    /*
     * Recursive Function to get minimum number of trials needed in worst case with
     * n eggs and
     * k floors
     */
    private static int eggDrop(int f, int e) {
        // If there are no floors, then no trials needed. OR if there is one floor, one
        // trial needed.
        if (f == 1 || f == 0) {
            return f;
        }

        // We need f trials for one egg and f floors
        if (e == 1) {
            return f;
        }
        // Consider all droppings from 1st floor to kth floor and return the minimum of
        // these values plus 1.
        int min = Integer.MAX_VALUE;
        int x;
        int res;
        for (x = 1; x <= f; x++) {
            res = Math.max(eggDrop(x - 1, e - 1), eggDrop(f - x, e));

            if (res < min) {
                min = res;
            }
        }

        return min + 1;
    }

    // Egg Dropping Puzzle DP Solution
    private static int eggDropDP(int f, int e) {
        int[][] dp = new int[f + 1][e + 1];
        for (int i = 1; i <= e; i++) {
            dp[1][i] = 1;
            dp[0][i] = 0;
        }
        for (int i = 1; i <= f; i++) {
            dp[i][1] = i;
        }
        for (int i = 2; i <= f; i++) {
            for (int j = 2; j <= e; j++) {
                dp[i][j] = Integer.MAX_VALUE;
                for (int x = 1; x <= i; x++) {
                    dp[i][j] = Math.min(dp[i][j], 1 + Math.max(dp[x - 1][j - 1], dp[i - x][j]));
                }
            }
        }
        return dp[f][e];
    }
}