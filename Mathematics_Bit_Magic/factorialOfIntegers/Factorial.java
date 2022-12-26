package factorialOfIntegers;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = in.nextInt();
        System.out.println("Recursive Factorial of " + n + " : ");
        System.out.println(factorial(n));
        System.out.println("Iterative Factorial of " + n + " : ");
        System.out.println(factorialIterative(n));

        in.close();
    }

    private static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    private static int factorialIterative(int n) {
        int factorial = 1;
        if (n == 0) {
            return factorial;
        } else {
            for (int i = n; i > 1; i--) {
                factorial *= i;
            }
            return factorial;
        }
    }
}
