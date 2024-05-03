public class Solution {
    public static void main(String[] args) {
        int[] arr = { 5, 10, 3, 6, 7, 8 };
        int[] arr2 = { 10, 20, 30 };
        int[] arr3 = { 30, 20, 10 };
        System.out.println(minDeletionsForSorted(arr));
        System.out.println(minDeletionsForSorted(arr2));
        System.out.println(minDeletionsForSorted(arr3));
    }

    // Minimum Deletions to make an array sorted, makes use of Longest Increasing
    // Subsequence
    private static int minDeletionsForSorted(int[] arr) {
        int n = arr.length;
        int[] tail = new int[n];
        int len = 1;
        tail[0] = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] >= tail[len - 1]) {
                tail[len] = arr[i];
                len++;
            } else {
                int c = cielIndex(tail, 0, len - 1, arr[i]);
                tail[c] = arr[i];
            }
        }

        return n - len;
    }

    private static int cielIndex(int[] tail, int l, int r, int x) {
        while (l < r) {
            int m = l + (r - l) / 2;
            if (tail[m] < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }

        return r;
    }
}