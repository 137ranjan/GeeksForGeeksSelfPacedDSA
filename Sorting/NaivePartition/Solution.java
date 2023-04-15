public class Solution {
    public static void main(String[] args) {
        int[] arr = { 5, 13, 6, 9, 12, 11, 8 };
        int low = 0;
        int high = arr.length - 1;
        int p = 6;

        naivePartition(arr, low, high, p);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }

    private static void naivePartition(int[] arr, int low, int high, int p) {
        int[] temp = new int[high - low + 1];
        int index = 0;

        for (int i = low; i <= high; i++) {
            if (arr[i] <= arr[p]) {
                temp[index] = arr[i];
                index++;
            }
        }
        for (int i = low; i <= high; i++) {
            if (arr[i] > arr[p]) {
                temp[index] = arr[i];
                index++;
            }
        }
        for (int i = low; i <= high; i++) {
            arr[i] = temp[i - low];
        }
    }
}