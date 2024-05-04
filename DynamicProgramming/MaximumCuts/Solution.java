public class Solution {
    public static void main(String[] args) {
        int n = 5;
        int a = 1;
        int b = 2;
        int c = 3;
        System.out.println(maxCuts(n, a, b, c));
    }

    private static int maxCuts(int n, int a, int b, int c) {
        if (n < 0) {
            return -1;
        }
        if (n == 0) {
            return 0;
        }
        int res = Math.max(maxCuts(n - a, a, b, c), Math.max(maxCuts(n - b, a, b, c), maxCuts(n - c, a, b, c)));
        if (res == -1) {
            return res;
        } else {
            return res + 1;
        }
    }
}