package BetterSolution;

import java.util.ArrayDeque;

public class BetterSolution {
    public static void main(String[] args) {
        int[] arr = { 6, 2, 5, 4, 1, 5, 6 };
        int result = getMaxArea(arr);
        System.out.println(result);
    }

    private static int getMaxArea(int[] arr) {
        int res = 0;
        int n = arr.length;
        int[] ps = previousSmallest(arr);
        int[] ns = nextSmallest(arr);
        for (int i = 0; i < n; i++) {
            int curr = arr[i];
            curr += (i - ps[i] - 1) * arr[i];
            curr += (ns[i] - i - 1) * arr[i];
            res = Math.max(res, curr);
        }
        return res;
    }

    private static int[] nextSmallest(int[] arr) {
        int[] ns = new int[arr.length];
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int n = arr.length;
        ns[n - 1] = n;
        stack.push(n - 1);
        for (int i = n - 2; i >= 0; i--) {
            while (stack.isEmpty() == false && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            ns[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }
        return ns;
    }

    private static int[] previousSmallest(int[] arr) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int[] ps = new int[arr.length];
        ps[0] = -1;
        stack.push(0);
        for (int i = 1; i < arr.length; i++) {
            while (stack.isEmpty() == false && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            ps[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        return ps;
    }
}
