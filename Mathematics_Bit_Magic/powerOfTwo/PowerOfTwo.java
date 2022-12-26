package powerOfTwo;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.print("\nEnter x : ");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        powerOfTwo(x);
        input.close();
    }

    private static void powerOfTwo(int x) {
        if (x == 0) {
            System.out.println("false");
        }
        System.out.println(((x & (x - 1)) == 0));
    }
}
