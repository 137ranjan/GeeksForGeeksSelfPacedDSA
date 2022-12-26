import java.util.Scanner;

class LinearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int x = in.nextInt();
        linearSearch(arr, x);
        in.close();
    }

    private static void linearSearch(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                System.out.println("found at index: " + i);
                return;
            }
        }
        System.out.println("Not found");
    }
}