public class Solution {
    public static void main(String[] args) {

        int[] a = { 5, 10, 30, 7, 15 };
        int l = 0;
        int r = a.length - 1;
        mergeSort(a, l, r);
        System.out.println(" ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(" ");
    }

    private static void mergeSort(int[] a, int l, int r) {
        if (r > l) {
            int m = l + (r - l) / 2;
            mergeSort(a, l, m);
            mergeSort(a, m + 1, r);
            merge(a, l, m, r);
        }
    }

    public static void merge(int[] a, int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = a[low + i];
        }

        for (int i = 0; i < n2; i++) {
            right[i] = a[mid + i + 1];
        }

        int i = 0, j = 0, k = low;

        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                a[k] = left[i];
                i++;
                k++;
            } else {
                a[k] = right[j];
                j++;
                k++;
            }
        }

        while (i < n1) {
            a[k] = left[i];
            i++;
            k++;
        }

        while (j < n2) {
            a[k] = right[j];
            j++;
            k++;
        }

    }
}