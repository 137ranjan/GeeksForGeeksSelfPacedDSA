public class Solution {
    public static void main(String[] args) {
        int[] a = { 2, 5, 8, 11, 3, 6, 9, 13 };
        System.out.println(countInv(a, 0, a.length - 1));

    }

    public static int countInv(int a[], int low, int high) {
        int res = 0;
        if (low < high) {
            int mid = low + (high - low) / 2;
            res += countInv(a, low, mid);
            res += countInv(a, mid + 1, high);
            res += countAndMerge(a, low, mid, high);
        }

        return res;
    }

    public static int countAndMerge(int a[], int low, int mid, int high) {
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

        int res = 0, i = 0, j = 0, k = low;

        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                a[k] = left[i];
                i++;
                k++;
            } else {
                a[k] = right[j];
                j++;
                k++;
                res = res + (n1 - i);
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

        return res;

    }
}