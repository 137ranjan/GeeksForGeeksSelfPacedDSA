package binToGrey;

import java.util.Scanner;

public class BinToGrey {
    public static void main(String[] args) {
        System.out.println("Enter N : ");
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int result = bintoGrey(N);
        System.out.println("Result = " + result);
        input.close();
    }

    private static int bintoGrey(int n) {
        String binaryString = Integer.toBinaryString(n);
        //System.out.println("binaryString = " + binaryString);
        String[] binArray = binaryString.split("");
        int[] greyArray = new int[binArray.length];
        greyArray[0] = Integer.parseInt(binArray[0]);
        for (int i = 1; i < binArray.length; i++) {
            greyArray[i] = Integer.parseInt(binArray[i - 1]) ^ Integer.parseInt(binArray[i]);
        }
        int result = 0;
        for (int i = greyArray.length-1, j=0; i >= 0; i--, j++) {
            result = (result + greyArray[j] * (int)Math.pow(2, i));
        }

        return result;
    }
}
