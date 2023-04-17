public class Solution {

    public static void main(String[] args) {
        int[] arr = { -12, 18, -10, 15 };
        segPosNeg(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }

    private static void segPosNeg(int[] arr) {
        int i = -1, j = arr.length;
        while (true) {
            do {
                i++;
            } while (arr[i] < 0);
            do {
                j--;
            } while (arr[j] > 0);
            if (i > j)
                return;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}