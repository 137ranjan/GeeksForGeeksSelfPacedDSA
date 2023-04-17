import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] arr = { 7, 3, 1, 8, 9, 12, 56 };
        int m = 3;
        int result = minDiff(arr, m);
        System.out.println("Result = " + result);
    }

    private static int minDiff(int[] arr, int m) {
        int n = arr.length;
        if (m > n) {
            return -1;
        }
        Arrays.sort(arr);
        int result = arr[m - 1] - arr[0];
        for (int i = 1; i + m - 1 < n; i++) {
            result = Math.min(result, arr[i + m - 1] - arr[i]);
        }
        return result;
    }
}