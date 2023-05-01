import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 10, 10, 20 };
        int k = 3;
        printNByK(arr, k);
    }

    private static void printNByK(int[] arr, int k) {
        HashMap<Integer, Integer> m = new HashMap<>();
        for (int x : arr) {
            m.put(x, m.getOrDefault(x, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> e : m.entrySet()) {
            if (e.getValue() > arr.length / k) {
                System.out.print(e.getKey() + " ");
            }
        }
    }
}