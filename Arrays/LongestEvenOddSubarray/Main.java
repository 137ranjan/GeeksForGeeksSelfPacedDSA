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
        System.out.println(longestEvenOddSubArr(arr));
        input.close();
    }

    private static int longestEvenOddSubArr(int[] arr) {
        int n = arr.length;
        int count = 0;
        int maxCount1 = 0;
        int maxCount2 = 0;
        for (int i = 0; i < n-1; i += 2) {
            if ((arr[i] % 2 == 0) && (arr[i + 1] % 2 != 0)) {
                count++;
            }
            maxCount1 = Math.max(maxCount1, count);
            count = 0;
        }
        for (int i = 0; i < n-1; i += 2) {
            if ((arr[i] % 2 != 0) && (arr[i + 1] % 2 == 0)) {
                maxCount2++;
            }
            maxCount2 = Math.max(maxCount2, count);
            count = 0;
        }
        return (maxCount1 > maxCount2) ? maxCount1 : maxCount2;
    }
}