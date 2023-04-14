public class Solution {
    public static void main(String[] args) {
        int[] a = { 10, 20, 20, 40, 60 };
        int[] b = { 2, 20, 20, 20 };
        int m = a.length;
        int n = b.length;

        intersection(a, b, m, n);
    }

    private static void intersection(int[] a, int[] b, int m, int n) {
        int i = 0;
        int j = 0;

        while (i < m && j < n) {
            if (i > 0 && a[i] == a[i - 1]) {
                i++;
                continue;
            }
            if (a[i] < b[j]) {
                i++;
            } else if (a[i] > b[j]) {
                j++;
            } else {
                System.out.print(a[i]);
                i++;
                j++;
            }
        }
    }
}