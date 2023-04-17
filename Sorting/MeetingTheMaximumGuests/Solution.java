import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] arr = { 900, 600, 700 };
        int[] dep = { 1000, 800, 730 };
        int result = maxGuest(arr, dep);
        System.out.println("Result = " + result);
    }

    private static int maxGuest(int[] arr, int[] dep) {
        int n = arr.length;
        Arrays.sort(arr);
        Arrays.sort(dep);

        int i = 1, j = 0, res = 1, curr = 1;
        while (i < n && j < n) {
            if (arr[i] <= dep[j]) {
                curr++;
                i++;
            } else {
                curr--;
                j++;
            }
            res = Math.max(res, curr);
        }
        return res;
    }

}