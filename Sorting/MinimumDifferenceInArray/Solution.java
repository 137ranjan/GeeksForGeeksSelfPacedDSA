import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] arr = { 10, 3, 20, 12 };
        int result = getMinDiff(arr);
        System.out.println("Result = " + result);
    }

    private static int getMinDiff(int[] arr) {
        Arrays.sort(arr);
        int result = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            result = Math.min(result, arr[i] - arr[i - 1]);
        }
        return result;
    }
}