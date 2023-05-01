import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 9, 2, 8, 2 };
        System.out.println(longestSub(arr));
    }

    private static int longestSub(int[] arr) {
        Set<Integer> h = new HashSet<>();
        for (int x : arr) {
            h.add(x);
        }
        int res = 1;
        for (Integer x : h) {
            if (h.contains(x - 1) == false) {
                int curr = 1;
                while (h.contains(x + curr)) {
                    curr++;
                }
                res = Math.max(curr, res);
            }
        }
        return res;
    }
}