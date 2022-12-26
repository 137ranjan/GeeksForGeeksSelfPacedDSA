import java.util.Arrays;
import java.util.Scanner;

class Seive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a positive integer upto which Prime Numbers are required : ");
        int n = in.nextInt();
        sieve(n);
        in.close();
    }

    private static void sieve(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        for (int i = 2; i <= n; i++) {
            if (isPrime[i] == true) {
                System.out.print(i);
                System.out.print(" ");
                for (int j = i * i; j <= n; j = j + i) {
                    isPrime[j] = false;
                }
            }
        }
        System.out.println(" ");
    }
}