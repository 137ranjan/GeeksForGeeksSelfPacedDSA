package bitwiseJava;

import java.util.Scanner;

public class Bitwise {
    public static void main(String[] args) {
        int x, y;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x : ");
        x = input.nextInt();
        System.out.print("Enter y : ");
        y = input.nextInt();

        System.out.println("Bitwise AND of x and y : " + (x & y));
        System.out.println("Bitwise OR of x and y : " + (x | y));
        System.out.println("Bitwise XOR of x and y : " + (x ^ y));
        System.out.println("Left Shift of x and y : " + (x << y));
        System.out.println("Right Shift of x and y : " + (x >> y));

        input.close();
    }
}