public class Solution {
    public static void main(String[] args) {
        int[] coins = { 2, 5, 3 };
        int n = 3;
        int s = 5;

        System.out.println(countWays(coins, n, s));
    }

    // Naive Recursive solution
    // Infinite number of each coin type is available
    // find the number of ways this sum can be paid using given coin types
    private static int countWays(int coins[], int n, int s) {
        if (s == 0)
            return 1;
        if (s < 0)
            return 0;
        if (n == 0)
            return 0;
        return countWays(coins, n, s - coins[n - 1]) + countWays(coins, n - 1, s);
    }
}