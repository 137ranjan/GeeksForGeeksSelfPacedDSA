import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Integer[] arr = { 10, 12, 10, 15, 10, 20, 12, 12 };
        frequency(arr);
        System.out.println(" ");
        countFrequency(arr);
    }

    private static void countFrequency(Integer[] arr) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for (int x : arr) {
            h.put(x, h.getOrDefault(x, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> e : h.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }

    private static void frequency(Integer[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer i : arr) {
            if (map.containsKey(i)) {
                int value = map.get(i);
                map.put(i, value + 1);
            } else {
                map.put(i, 1);
            }
        }

        for (Integer i : map.keySet()) {
            System.out.println(i + " " + map.get(i));
        }
    }
}