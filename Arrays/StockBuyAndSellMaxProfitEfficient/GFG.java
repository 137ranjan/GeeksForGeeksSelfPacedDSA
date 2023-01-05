import java.util.Scanner;

/**
 * GFG
 */
public class GFG {
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
        System.out.println(maxProfit(arr));
        input.close();
    }

    private static int maxProfit(int[] price) {
        int profit = 0; 
        for (int i = 1; i < price.length; i++) {
            if (price[i] > price[i-1]) {
                profit += (price[i] - price[i-1]);
            }
        }
        return profit;
    }

}