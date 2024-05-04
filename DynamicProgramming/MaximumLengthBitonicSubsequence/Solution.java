public class Solution {
    public static void main(String[] args) {
        int[] arr = { 1, 11, 2, 10, 4, 5, 2, 1 };
        System.out.println(maxLengthBitonicSubsequence(arr));
    }

    private static int maxLengthBitonicSubsequence(int[] arr) {
        int n = arr.length;
        int[] lis = new int[n]; // longest increasing subsequence
        lis[0] = 1;
        for (int i = 1; i < n; i++) {
            lis[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) {
                    lis[i] = Math.max(lis[i], lis[j] + 1);
                }
            }
        }

        int[] lds = new int[n]; // longest decreasing subsequence
        lds[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            lds[i] = 1;
            for (int j = n - 1; j > i; j--) {
                if (arr[j] < arr[i]) {
                    lds[i] = Math.max(lds[i], lds[j] + 1);
                }
            }
        }
        int maxLen = lis[0] + lds[0] - 1;
        for (int i = 0; i < n; i++) {
            maxLen = Math.max(maxLen, lis[i] + lds[i] - 1);
        }
        return maxLen;
    }
}
