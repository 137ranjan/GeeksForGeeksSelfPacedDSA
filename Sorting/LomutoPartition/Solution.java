public class Solution {
    public static void main(String[] args) {
        int[] arr = { 10, 80, 30, 90, 40, 50, 70 };
        int low = 0;
        int high = arr.length - 1;

        lomutoPartition(arr, low, high);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }

    private static void lomutoPartition(int[] arr, int low, int high) {
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
    }

}
