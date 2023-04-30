import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 8, 15, -8 };
        int sum = 17;

        System.out.println(isPair(arr, sum));
    }

    private static boolean isPair(int[] arr, int sum) {
        Set<Integer> h = new HashSet<>();
        for (int x : arr) {
            if (h.contains(sum - x)) {
                return true;
            } else {
                h.add(x);
            }
        }
        return false;
    }
}