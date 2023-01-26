import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x : ");
        int x = input.nextInt();
        int result = squareRootFloor(x);
        System.out.println("Result : " + result);
        input.close();
    }

    private static int squareRootFloor(int x) {
        int low = 1;
        int high = x;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int mSq = mid * mid;
            if (mSq == x) {
                return mid;
            } else if (mSq > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }
}
