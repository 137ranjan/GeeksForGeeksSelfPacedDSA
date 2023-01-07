import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
        System.out.println(maxKsum(arr, 4));
        input.close();
    }

    private static int maxKsum(int[] arr, int k) {
        int curr = 0;
        for (int i = 0; i < k; i++) {
            curr += arr[i];
        }
        int res = curr;
        for (int i = k; i < arr.length; i++) {
            curr = curr + arr[i] - arr[i - k];
            res = Math.max(res, curr);
        }
        return res;
    }

}