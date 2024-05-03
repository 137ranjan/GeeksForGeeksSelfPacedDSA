public class Solution {
    public static void main(String[] args) {
        int[] arr = { 10, 5, 18, 7, 2, 9 };
        int n = arr.length;
        System.out.println(longestIncSubseq(arr, n));
        System.out.println(lisEfficient(arr, n));
    }

    // longest increasing subsequence: Time complexity = O(n^2)
    private static int longestIncSubseq(int[] arr, int n) {
        int[] lis = new int[n];
        lis[0] = 1;
        for (int i = 1; i < n; i++) {
            lis[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) {
                    lis[i] = Math.max(lis[i], lis[j] + 1);
                }
            }
        }

        int res = lis[0];
        for (int i = 1; i < n; i++) {
            res = Math.max(res, lis[i]);
        }
        return res;
    }

    private static int lisEfficient(int[] arr, int n) {
        int[] tail = new int[n];
        int len = 1;
        tail[0] = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > tail[len - 1]) {
                tail[len] = arr[i];
                len++;
            } else {
                int c = cielIndex(tail, 0, len - 1, arr[i]);
                tail[c] = arr[i];
            }
        }

        return len;
    }

    private static int cielIndex(int[] tail, int l, int r, int x) {
        while (l < r) {
            int m = l + (r - l) / 2;
            if (tail[m] >= x) {
                r = m;
            } else {
                l = m + 1;
            }
        }

        return r;
    }
}