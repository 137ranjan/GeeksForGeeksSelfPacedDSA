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
        System.out.println(equilibriumPoint3(arr));
        input.close();
    }

    // private static boolean equilibriumPoint(int[] arr) {
    // for (int i = 0; i < arr.length; i++) {
    // int leftSum = 0;
    // int rightSum = 0;
    // for (int j = 0; j < i; j++) {
    // leftSum += arr[j];
    // }
    // for (int j = i + 1; j < arr.length; j++) {
    // rightSum += arr[j];
    // }
    // if (leftSum == rightSum) {
    // return true;
    // }
    // }
    // return false;
    // }

    // private static boolean equilibriumPoint2(int[] arr) {
    //     int n = arr.length;
    //     int[] prefixSum = new int[n];
    //     int[] suffixSum = new int[n];

    //     prefixSum[0] = 0;
    //     for (int i = 1; i < n; i++) {
    //         prefixSum[i] = prefixSum[i - 1] + arr[i];
    //     }

    //     suffixSum[n - 1] = 0;
    //     for (int i = n - 2; i >= 0; i--) {
    //         suffixSum[i] = suffixSum[i + 1] + arr[i];
    //     }

    //     if ((prefixSum[n - 2] == 0) || (suffixSum[1] == 0)) {
    //         return true;
    //     }
    //     for (int i = 0; i < n; i++) {
    //         if (prefixSum[i] == suffixSum[i]) {
    //             return true;
    //         }
    //     }

    //     return false;

    // }

    private static boolean equilibriumPoint3(int[] arr) {
        int n = arr.length;
        int prefixSum = 0;
        int suffixSum = 0;
        for (int i = 0; i < n; i++) {
            suffixSum += arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            suffixSum -= arr[i];
            if (prefixSum == suffixSum) {
                return true;
            }
            prefixSum += arr[i];
        }
        return false;
    }
}