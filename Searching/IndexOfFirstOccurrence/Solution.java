public class Solution {
    public static void main(String[] args) {
        int[] arr = {1, 10, 10, 10, 20, 20, 40};
        int x = 15;
        int result = indexOfFirstOccurrence(arr, x);
        System.out.println(result);
    }

    private static int indexOfFirstOccurrence(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > x) {
                high = mid - 1;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                if (mid == 0 || arr[mid - 1] != arr[mid]) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
