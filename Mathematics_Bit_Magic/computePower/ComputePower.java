package computePower;

import java.util.Scanner;

public class ComputePower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of exponent : ");
        int x = sc.nextInt();
        System.out.println("Enter the power of exponent : ");
        int n = sc.nextInt();
        computePower(x, n);
        System.out.println("computePower2() = " + computePower2(x, n));
        System.out.println("computePower3() = " + computePower3(x, n));
        sc.close();
    }

    private static int computePower3(int x, int n) {
        int res = 1;
        while (n > 0) {
            if (n % 2 != 0) {
                res = res * x;
            }
            x = x * x;
            n = n / 2;
        }

        return res;
    }

    private static int computePower2(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int temp = computePower2(x, n / 2);
        temp = temp * temp;
        if (n % 2 == 0) {
            return temp;
        } else {
            return temp * x;
        }
    }

    private static void computePower(int x, int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= x;
        }
        System.out.println("Result : " + result);
    }
}
