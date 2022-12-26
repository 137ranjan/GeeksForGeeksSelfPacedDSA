package countOfSetBits;

import java.util.Scanner;

public class CountOfSetBits {
    public static void main(String[] args) {
        int X;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter X :");
        X = input.nextInt();
        countOfSetBits(X);
        countOfSetBits2(X);
        initialize();
        countOfSetBits3(X);
        input.close();

    }

    public static int[] tbl = new int[256];

    public static void initialize() {
        tbl[0] = 0;
        for (int i = 1; i < 256; i++) {
            tbl[i] = tbl[i & (i - 1)] + 1;
        }
    }

    private static void countOfSetBits3(int x) {
        System.out.println(tbl[x & 255] +
                tbl[(x >> 8) & 255] +
                tbl[(x >> 16) & 255] +
                tbl[(x >> 24)]);
    }

    private static void countOfSetBits2(int x) {
        int count = 0;
        while (x > 0) {
            x = x & (x - 1);
            count++;
        }

        System.out.println("func2() = " + count);
    }

    private static void countOfSetBits(int x) {
        int count = 0;
        for (; x > 0; x = (x >> 1)) {
            if ((x & 1) != 0) {
                count++;
            }
        }
        System.out.println(count);
    }

}
