package PrimeFactors;

import java.util.Scanner;

/**
 * PrimeFactors
 */
public class PrimeFactors {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an Integer");
        int n = in.nextInt();
        // primeFactors1(n);
        primeFactors2(n);
        in.close();
    }

    private static void primeFactors2(int n) {
        if (n <= 1) {
            return;
        }
        while (n % 2 == 0) {
            System.out.println(2);
            n = n / 2;
        }
        while (n % 3 == 0) {
            System.out.println(3);
            n = n / 3;
        }
        for (int i = 5; i * i <= n; i += 6) {
            while (n % i == 0) {
                System.out.println(i);
                n = n / i;
            }
            while (n % (i + 2) == 0) {
                System.out.println(i + 2);
                n = n / (i + 2);
            }
        }
        if (n > 3) {
            System.out.println(n);
        }
    }

    // private static boolean isPrime(int n) {
    // if (n == 1) {
    // return false;
    // }
    // if (n == 2 || n == 3) {
    // return true;
    // }
    // if (n % 2 == 0 || n % 3 == 0) {
    // return false;
    // } else {
    // for (int i = 5; i * i <= n; i = i + 6) {
    // if (n % i == 0 || n % (i + 2) == 0) {
    // return false;
    // }
    // }
    // return true;
    // }
    // }

    // private static void primeFactors1(int n) {

    // for (int i = 2; i <= n; i++) {
    // if (isPrime(i) == true) {
    // int x = i;
    // while (n % x == 0) {
    // System.out.print(i);
    // System.out.print(", ");
    // x = x * i;
    // }
    // }
    // }

    // }
}