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
        int start = input.nextInt();
        int end = input.nextInt();
        int[] ps = new int[n];
        preProcess(ps, arr);
        System.out.println(getSum(arr, start, end, ps));
        input.close();

    }

    private static int getSum(int[] arr, int start, int end, int[] ps) {
        if (start == 0) {
            return ps[end];
        }
        return ps[end] - ps[start - 1];
    }

    private static void preProcess(int[] ps, int[] arr) {
        ps[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            ps[i] = ps[i - 1] + arr[i];
        }
    }
}