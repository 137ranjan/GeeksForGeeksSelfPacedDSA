/**
 * Matrix
 */
public class Matrix {

    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }

        int m = 2, n = 3;
        int[][] arr2 = new int[m][n];

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = 10;
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println(" ");
        }

        int p = 3;
        int arr3[][] = new int[p][];

        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = new int[i + 1];
            for (int j = 0; j < arr3[i].length; j++) {
                arr3[i][j] = i;
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
}