public class Solution {
    public static void main(String[] args) {
        int[] arr = { 10, 5, 15, 20 };
        System.out.println(maxSum(arr, arr.length));
    }

    // Recursive Solution
    private static int maxSum(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        } else if (n == 2) {
            return Math.max(arr[0], arr[1]);
        } else {
            return Math.max(maxSum(arr, n - 1), maxSum(arr, n - 2) + arr[n - 1]);
        }
    }
}