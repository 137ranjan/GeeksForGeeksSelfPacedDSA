import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 20, 10, 30, 40, 10 };
        int[] arr2 = { 10, 10, 10, 10 };
        int[] arr3 = { 10, 20, 30, 40 };
        int k = 4;
        countDist(arr, k);
    }

    private static void countDist(int[] arr, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < k; i++) {
            if (freqMap.containsKey(arr[i])) {
                freqMap.put(arr[i], freqMap.get(arr[i]) + 1);
            } else {
                freqMap.put(arr[i], 1);
            }
        }
        System.out.print(freqMap.size() + " ");
        for (int i = k; i < arr.length; i++) {
            if (freqMap.containsKey(arr[i - k])) {
                freqMap.put(arr[i - k], freqMap.get(arr[i - k]) - 1);
            }
            if (freqMap.get(arr[i - k]) == 0) {
                freqMap.remove(arr[i - k]);
            }
            if (freqMap.containsKey(arr[i])) {
                freqMap.put(arr[i], freqMap.get(arr[i]) + 1);
            } else {
                freqMap.put(arr[i], 1);
            }
            System.out.print(freqMap.size() + " ");
        }
    }
}