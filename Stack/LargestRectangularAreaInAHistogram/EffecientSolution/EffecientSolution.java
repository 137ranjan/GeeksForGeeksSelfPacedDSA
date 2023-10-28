package EffecientSolution;

import java.util.ArrayDeque;

public class EffecientSolution {
    public static void main(String[] args) {
        int[] arr = { 6, 2, 5, 4, 1, 5, 6 };
        int result = getMaxArea(arr);
        System.out.println(result);
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