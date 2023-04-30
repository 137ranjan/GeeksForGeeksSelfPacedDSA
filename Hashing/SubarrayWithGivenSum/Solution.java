import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 2, -1 };
        int sum = 4;
        System.out.println(isSum(arr, sum));
    }

    private static boolean isSum(int[] arr, int sum) {
        Set<Integer> h = new HashSet<>();
        int preSum = 0;
        for (int x : arr) {
            preSum += x;
            if (preSum == sum) {
                return true;
            }
            if (h.contains(preSum - sum)) {
                return true;
            }
            h.add(preSum);
        }
        return false;
    }
}