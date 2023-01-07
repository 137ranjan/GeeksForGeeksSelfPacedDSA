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
        int sum = input.nextInt();
        System.out.println("\n");
        System.out.println(subArrWithSum(arr, sum));
        input.close();
    }

    private static boolean subArrWithSum(int[] arr, int sum) {
        int start = 0, curr = 0;
        for (int end = 0; end < arr.length; end++) {
            curr += arr[end];
            while (sum < curr) {
                curr -= arr[start];
                start++;
            }
            if (curr == sum) {
                return true;
            }
        }
        return false;
    }
}
