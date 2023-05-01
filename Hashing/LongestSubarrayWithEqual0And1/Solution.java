import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 1 };
        int[] arr2 = { 1, 0, 1, 1, 1, 0, 0 };
        int[] arr3 = { 0, 0, 1, 0, 1, 1 };

        int sum = 0;

        System.out.println(longestSubarrSum(arr3, sum));
    }

    private static int longestSubarrSum(int[] arr, int sum) {
        int longestSubarr = 0;
        int preSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = -1;
            }
        }
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