package GCD;

import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter integer (a): ");
        int a = in.nextInt();
        System.out.println("Enter integer (b): ");
        int b = in.nextInt();
        System.out.println(gcd(a, b));
        System.out.println(lcm(a, b));
        in.close();
    }

    private static int lcm(int a, int b) {

        return (a * b) / gcd(a, b);
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
