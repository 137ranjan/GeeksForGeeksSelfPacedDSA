public class Solution {
    public static int[][] g = {
            { 1, 0, 3, 4 },
            { 0, 0, 2, 1 },
            { 0, 1, 4, 2 },
            { 2, 4, 1, 0 }
    };

    public static void main(String[] args) {

        System.out.println(solve());
        for (int i = 0; i < g.length; i++) {
            for (int j = 0; j < g[0].length; j++) {
                System.out.print(g[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean solve() {
        int N = g.length;
        int i=0, j=0;
        outerloop:
        for (i=0; i < N; i++) {
            for (j=0; j < N; j++) {
                if (g[i][j] == 0) {
                    break outerloop;
                }
            }
        }
        if (i == N && j == N) {
            return true;
        }
        for (int x = 1; x <= N; x++) {
            if (isSafe(i, j, x)) {
                g[i][j] = x;
                if (solve() == true) {
                    return true;
                }
                g[i][j] = 0;
            }
        }
        return false;
    }

    public static boolean isSafe(int i, int j, int x) {
        int N = g.length;
        for (int k = 0; k < N; k++) {
            if (g[k][j] == x || g[i][k] == x) {
                return false;
            }
        }
        int s = (int) Math.sqrt(N);
        int rs = i - i % s;
        int cs = j - j % s;
        for (int m = 0; m < s; m++) {
            for (int n = 0; n < s; n++) {
                if (g[m + rs][n + cs] == x) {
                    return false;
                }
            }
        }
        return true;
    }
}