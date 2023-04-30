import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 8, 15, -8 };
        int sum = 17;

        //System.out.println(pairWithGivenSum(arr, sum));
        System.out.println(isPair(arr, sum));
    }

    // effecient
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

    // naive
    private static boolean pairWithGivenSum(int[] arr, int sum) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    return true;
                }
            }
        }
        return false;
    }
}