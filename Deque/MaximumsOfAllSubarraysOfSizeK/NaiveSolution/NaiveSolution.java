public class NaiveSolution {
    public static void main(String[] args) {
        int[] arr = { 10, 8, 5, 12, 15, 7, 6 };
        int n = arr.length;
        int k = 3;
        printMaxK(arr, n, k);
    }

    private static void printMaxK(int[] arr, int n, int k) {
        for (int i = 0; i < n - k + 1; i++) {
            int mx = arr[i];
            for (int j = i + 1; j < i + k; j++) {
                mx = Math.max(mx, arr[j]);
            }
            System.out.println("i = " + i + " Max = " + mx);
        }
    }
}