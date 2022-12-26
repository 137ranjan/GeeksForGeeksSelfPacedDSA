package checkKthBitIsSet;

import java.util.Scanner;

public class CheckKthBitSet {
    public static void main(String[] args) {

        int N, K;

        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter N : ");
        N = input.nextInt();
        System.out.print("\nEnter K : ");
        K = input.nextInt();

        func1(N, K);

        input.close();
    }

    private static void func1(int n, int k) {
        int x = (1 << (k - 1));

        if ((n & x) != 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
