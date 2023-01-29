public class Solution {
    public static void main(String[] args) {
        int[] arr = {2, 5, 10, 15, 18};
        int x = 33;
        boolean result = isTriplet(arr, x);
        System.out.println(result);
    }

    private static boolean isTriplet(int[] arr, int x) {
        for (int i = 0; i < arr.length - 2; i++) {
            if (isPair(arr, x - arr[i], i + 1)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isPair(int[] arr, int x, int si) {
        int i = si, j = arr.length - 1;
        while (i < j) {
            if (arr[i] + arr[j] == x) {
                return true;
            } else if (arr[i] + arr[j] < x) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }
}
