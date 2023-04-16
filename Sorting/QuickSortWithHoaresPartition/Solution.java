public class Solution {
    public static void main(String[] args) {
        int[] arr = { 8, 4, 7, 9, 3, 10, 5 };
        int low = 0;
        int high = arr.length - 1;
        quickSortHoares(arr, low, high);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }

    private static void quickSortHoares(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = hoaresPartition(arr, low, high);
            quickSortHoares(arr, low, pivotIndex);
            quickSortHoares(arr, pivotIndex + 1, high);
        }
    }

    private static int hoaresPartition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low - 1;
        int j = high + 1;
        while (true) {
            do {
                i++;
            } while (arr[i] < pivot);

            do {
                j--;
            } while (arr[j] > pivot);

            if (i >= j) {
                return j;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}