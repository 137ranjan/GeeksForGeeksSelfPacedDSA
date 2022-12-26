package countOfDigits;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = in.nextInt();
        System.out.println("Number of digits in " + n + " : ");
        System.out.println(countDigits(n));
        in.close();
    }

    private static int countDigits(int n) {
        int count = 0;
        if (n == 0) {
            return 1;
        }
        for (int i = Math.abs(n); i > 0; i = i / 10) {
            count++;
        }
        return count;
    }
}
