public class Solution {
    public static void main(String[] args) {
        int[] arr = {1, 10, 10, 10, 20, 40, 40};
        int x = 40;
        int result = indexOfLastOccurrence(arr, x);
        System.out.println(result);
    }

    private static int indexOfLastOccurrence(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > x) {
                high = mid - 1;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                if (mid == arr.length - 1 || arr[mid + 1] != arr[mid]) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }
}
