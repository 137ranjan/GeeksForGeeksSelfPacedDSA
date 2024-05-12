public class Solution {
    public static void main(String[] args) {
        int[] arr = { 20, 10, 30, 40 };
        System.out.println(mChain(arr, 0, 3));
    }

    // Recursive solution
    private static int mChain(int[] arr, int i, int j) {
        if (i + 1 == j) {
            return 0;
        }
        int res = Integer.MAX_VALUE;
        for (int k = i + 1; k < j; k++) {
            res = Math.min(res, mChain(arr, i, k) + mChain(arr, k, j) + arr[i] * arr[j] * arr[k]);
        }

        return res;
    }
}