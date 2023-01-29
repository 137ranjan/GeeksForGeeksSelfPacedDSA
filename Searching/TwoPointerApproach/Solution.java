public class Solution {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 8, 12, 30 };
        int x = 17;
        boolean result = isPair(arr, x);
        System.out.println(result);
    }

    private static boolean isPair(int[] arr, int x) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            if (arr[i] + arr[j] == x)
                return true;
            else if (arr[i] + arr[j] < x)
                i++;
            else
                j--;
        }
        return false;
    }
}
