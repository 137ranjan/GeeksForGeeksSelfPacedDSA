public class Solution {

    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 1, 1, 1, 2 };
        sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }

    private static void sort(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, mid, high);
                high--;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}