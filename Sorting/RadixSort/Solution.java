public class Solution {
    public static void main(String[] args) {
        int[] arr = { 319, 212, 6, 8, 100, 50 };
        radixSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }

    private static void radixSort(int[] arr) {
        int mx = arr[0];
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if (arr[i] > mx) {
                mx = arr[i];
            }
        }
        for (int exp = 1; mx / exp > 0; exp = exp * 10) {
            countingSort(arr, n, exp);
        }
    }

    public static void countingSort(int[] arr, int n, int exp) {
        int[] count = new int[10];
        int[] output = new int[n];
        for (int i = 0; i < n; i++) {
            count[(arr[i] / exp) % 10]++;
        }
        for (int i = 1; i < 10; i++) {
            count[i] = count[i - 1] + count[i];
        }
        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }
}