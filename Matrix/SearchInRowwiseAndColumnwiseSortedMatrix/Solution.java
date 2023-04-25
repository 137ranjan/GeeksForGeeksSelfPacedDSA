public class Solution {
    public static void main(String[] args) {
        int[][] mat = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 }
        };

        int x = 29;
        search(mat, x);
    }

    private static void search(int[][] mat, int x) {
        int r = mat.length;
        int c = mat[0].length;
        int i = 0, j = c - 1;
        while (i < r && j >= 0) {
            if (mat[i][j] == x) {
                System.out.println("Found at (" + i + "," + j + ")");
                return;
            } else if (mat[i][j] > x) {
                j--;
            } else {
                i++;
            }
        }
        System.out.println("Not Found");
    }
}