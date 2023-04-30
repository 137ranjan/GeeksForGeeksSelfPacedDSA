import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 13, -3, -10, 5 };

        System.out.println(is0SubArray(arr));
    }

    private static boolean is0SubArray(int[] arr) {
        HashSet<Integer> h = new HashSet<>();
        int preSum = 0;
        for (int i = 0; i < arr.length; i++) {
            preSum += arr[i];
            if (h.contains(preSum)) {
                return true;
            }
            if (preSum == 0) {
                return true;
            }
            h.add(preSum);
        }
        return false;
    }
}