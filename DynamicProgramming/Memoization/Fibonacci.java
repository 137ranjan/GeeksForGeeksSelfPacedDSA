import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 5;
        int[] memo = new int[n + 1];
        Arrays.fill(memo, -1);
        System.out.println(fibonacci(n, memo));
    }

    private static int fibonacci(int n, int[] memo) {
        if (memo[n] == -1) {
            int res;
            if (n == 0 || n == 1) {
                res = n;
            } else {
                res = fibonacci(n - 1, memo) + fibonacci(n - 2, memo);
            }
            memo[n] = res;
        }
        return memo[n];
    }

}