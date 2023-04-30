import java.util.Arrays;
import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        Integer[] a = { 10, 15, 20, 25, 30, 50 };
        Integer[] b = { 30, 5, 15, 80 };

        printIntersection(a, b);

    }

    private static void printIntersection(Integer[] a, Integer[] b) {
        HashSet<Integer> set = new HashSet<>(Arrays.asList(b));
        for (Integer i : a) {
            if (set.contains(i)) {
                System.out.println(i);
            }
        }
    }
}