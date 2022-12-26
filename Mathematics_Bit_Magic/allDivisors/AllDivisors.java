package allDivisors;

import java.util.Scanner;

public class AllDivisors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter an Integer: ");
        int n = in.nextInt();
        System.out.println("All divisors are: ");
        divisors(n);
        divisors2(n);
        in.close();
    }

    private static void divisors2(int n) {
        int i;
        for (i = 1; i * i < n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
        for (; i >= 1; i--) {
            if (n % i == 0) {
                System.out.println(n / i);
            }
        }
    }

    private static void divisors(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }
}
