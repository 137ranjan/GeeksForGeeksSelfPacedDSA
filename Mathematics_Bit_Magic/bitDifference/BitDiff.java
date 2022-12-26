package bitDifference;

import java.util.Scanner;

public class BitDiff {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter a :");
        int a = input.nextInt();
        System.out.print("\nEnter b:");
        int b = input.nextInt();

        int result = bitDiff(a,b);
        System.out.println("result = "+result);

        input.close();

    }

    private static int bitDiff(int a, int b) {
        int x = a ^ b;
        int count = 0;
        for(int i=0; i<32; i++){
            if((x & (1 << i)) != 0 ){
                count++;
            }
        }
        
        return count;
    }
}
