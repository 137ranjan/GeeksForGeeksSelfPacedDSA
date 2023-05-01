import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        int[] a = { 0, 1, 0, 0, 0, 0 };
        int[] b = { 1, 0, 1, 0, 0, 1 };
        int[] temp = new int[a.length];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = a[i] - b[i];
        }

        System.out.println(longestSubarrSum(temp, 0));

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