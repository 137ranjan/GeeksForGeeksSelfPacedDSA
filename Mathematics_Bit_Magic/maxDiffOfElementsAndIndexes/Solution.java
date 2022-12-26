import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println(maxDistance(arr, n));
        input.close();
    }

    public static int maxDistance(int arr[], int n) {
        int maxElement = arr[0];
        int minElement = arr[0];
        int maxIndex = 0;
        int minIndex = 0;
        int result = 0;

        for (int i = 0; i < n; i++) {
            if (maxElement < arr[i]) {
                maxElement = arr[i];
                maxIndex = i;
            }
        }

        for (int i = 0; i < n; i++) {
            if (minElement > arr[i]) {
                minElement = arr[i];
                minIndex = i;
            }
        }

        System.out.println("maxElement = " + maxElement);
        System.out.println("minElement = " + minElement);
        System.out.println("maxIndex = " + maxIndex);
        System.out.println("minIndex = " + minIndex);

        result = Math.abs(maxElement - minElement) + Math.abs(maxIndex - minIndex);

        return result;
    }
}