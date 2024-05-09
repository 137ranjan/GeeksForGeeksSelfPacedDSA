public class Solution {
    public static void main(String[] args) {
        int[] arr = { 20, 5, 4, 6 };
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println(sol1(arr, 0, n - 1, sum));
        System.out.println(sol2(arr, 0, n - 1));
    }

    // Recursive solution 1, cannot use this for DP solution since sum can be large
    // number for matrix dimension
    public static int sol1(int[] arr, int i, int j, int sum) {
        if (j == i + 1) {
            return Math.max(arr[i], arr[j]);
        }

        return Math.max(sum - sol1(arr, i + 1, j, sum - arr[i]), sum - sol1(arr, i, j - 1, sum - arr[j]));
    }

    // Recursive solution 2
    public static int sol2(int[] arr, int i, int j) {
        if (i + 1 == j) {
            return Math.max(arr[i], arr[j]);
        }

        return Math.max(arr[i] + Math.min(sol2(arr, i + 2, j), sol2(arr, i + 1, j - 1)),
                arr[j] + Math.min(sol2(arr, i + 1, j - 1), sol2(arr, i, j - 2)));
    }
}