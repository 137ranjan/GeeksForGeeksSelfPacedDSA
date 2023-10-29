import java.util.ArrayDeque;

public class Solution {
    public static void main(String[] args) {
        int[][] mat = {
                { 1, 0, 0, 1, 1 },
                { 0, 0, 0, 1, 1 },
                { 1, 1, 1, 1, 1 },
                { 0, 1, 1, 1, 1 }
        };
        int result = maxRectangle(mat, 4, 5);
        System.out.println(result);
    }

    private static int maxRectangle(int[][] mat, int r, int c) {
        int res = getMaxArea(mat[0]);
        for (int i = 1; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (mat[i][j] == 1) {
                    mat[i][j] += mat[i - 1][j];
                }
                res = Math.max(res, getMaxArea(mat[i]));
            }
        }
        return res;
    }

    private static int getMaxArea(int[] arr) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int res = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                int top = stack.pop();
                int curr = arr[top] * (stack.isEmpty() ? i : (i - stack.peek() - 1));
                res = Math.max(res, curr);
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            int top = stack.pop();
            int curr = arr[top] * (stack.isEmpty() ? n : (n - stack.peek() - 1));
            res = Math.max(res, curr);
        }
        return res;
    }
}