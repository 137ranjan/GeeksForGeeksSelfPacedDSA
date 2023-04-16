public class Solution {
    public static void main(String[] args) {
        int[] arr = { 10, 4, 5, 8, 11, 6, 26 };
        int k = 4;

        int result = kThSmallest(arr, k);
        System.out.println("Result = " + result);
    }

    private static int kThSmallest(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int pivotIndex = lomutoPartition(arr, low, high);
            if (pivotIndex == k - 1) {
                return arr[pivotIndex];
            } else if (pivotIndex > (k - 1)) {
                high = pivotIndex - 1;
            } else {
                low = pivotIndex + 1;
            }
        }
        return -1;
    }

    private static int lomutoPartition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j <= high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}