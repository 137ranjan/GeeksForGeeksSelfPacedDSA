package quadraticRoots;

import java.util.ArrayList;
import java.util.Scanner;

public class QuadraticRoots {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        System.out.println(quadraticRoots(a,b,c));
        input.close();
    }

    private static  ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        // code here 752 904 164
        ArrayList<Integer> resultList = new ArrayList<>();
        
        double D = Math.sqrt(b*b - 4*a*c) ;
        
        double x1 = (double)(( (-b) + D) / (double)(2*a));
        double x2 = (double)(( (-b) - D) / (double)(2*a));
        
        resultList.add((int)Math.floor(x1));
        resultList.add((int)Math.floor(x2));
        
        return resultList;
    }
}
