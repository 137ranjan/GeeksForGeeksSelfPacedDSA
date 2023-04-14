public class Solution {
    public static void main(String[] args) {
        int[] a = { 2, 10, 20, 20 };
        int[] b = { 3, 20, 40 };

        printUnion(a, b);
    }

    private static void printUnion(int[] a, int[] b) {
        int m = a.length;
        int n = b.length;

        int i = 0, j = 0;
        while (i < m && j < n) {
            if (i > 0 && a[i] == a[i - 1]) {
                i++;
                continue;
            }
            if (j > 0 && b[j] == b[j - 1]) {
                j++;
                continue;
            }
            if (a[i] < b[j]) {
                System.out.print(a[i] + " ");
                i++;
            } else if (a[i] > b[j]) {
                System.out.print(b[j] + " ");
                j++;
            } else {
                System.out.print(a[i] + " ");
                i++;
                j++;
            }
        }
        while (i < m) {
            if (i > 0 && a[i] != a[i - 1]) {
                System.out.print(a[i] + " ");
                i++;
            } else {
                i++;
            }
        }
        while (j < n) {
            if (j > 0 && b[j] != b[j - 1]) {
                System.out.print(b[j] + " ");
                j++;
            } else {
                j++;
            }
        }
    }
}