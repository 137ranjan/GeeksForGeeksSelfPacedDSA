package palindromeNumbers;

import java.util.Scanner;

public class PlaindromeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = in.nextInt();
        System.out.println("isPalindrome ? ");
        System.out.println(palindromeNumber(n));
        in.close();
    }

    private static boolean palindromeNumber(int n) {
        int rev = 0;
        if (n / 10 == 0) {
            return false;
        }
        for (int i = n; i > 0; i = i / 10) {
            rev = rev * 10 + i % 10;
        }
        if (rev == n) {
            return true;
        } else {
            return false;
        }
    }
}
