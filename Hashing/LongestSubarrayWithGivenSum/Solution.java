import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        int[] arr = { 5, 8, -4, -4, 9, -2, 2 };
        int[] arr2 = { 3, 1, 0, 1, 8, 2, 3, 6 };
        int[] arr3 = { 8, 3, 7 };

        int sum = 5;

        System.out.println(longestSubarrSum(arr2, sum));
    }

    private static int longestSubarrSum(int[] arr, int sum) {
        int longestSubarr = 0;
        int preSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            preSum += arr[i];
            if (preSum == sum) {
                longestSubarr = i + 1;
            }
            if (map.get(preSum - sum) != null) {
                if (i - map.get(preSum - sum) > longestSubarr) {
                    longestSubarr = i - map.get(preSum - sum);
                }
            } else {
                map.put(preSum, i);
            }
        }
        return longestSubarr;
    }
}