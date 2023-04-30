import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        int[] a = { 15, 20, 5, 15 };
        int[] b = { 15, 15, 15, 20, 10 };

        System.out.println(unionOfArrays(a, b));
    }

    public static int unionOfArrays(int[] a, int[] b) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            set.add(b[i]);
        }

        return set.size();
    }
}
