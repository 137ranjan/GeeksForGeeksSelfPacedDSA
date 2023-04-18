public class Solution {
    public static void main(String[] args) {
        int[] arr = { 20, 40, 50, 10, 30 };
        cycleSortDistinct(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }

    private static void cycleSortDistinct(int[] arr) {
        int n = arr.length;
        for (int cs = 0; cs < n - 1; cs++) {
            int item = arr[cs];
            int pos = cs;
            for (int i = cs + 1; i < n; i++) {
                if (arr[i] < item) {
                    pos++;
                }
            }

            int temp = item;
            item = arr[pos];
            arr[pos] = temp;

            while (pos != cs) {
                pos = cs;
                for (int i = cs + 1; i < n; i++) {
                    if (arr[i] < item) {
                        pos++;
                    }
                }
                temp = item;
                item = arr[pos];
                arr[pos] = temp;
            }
        }
    }
}