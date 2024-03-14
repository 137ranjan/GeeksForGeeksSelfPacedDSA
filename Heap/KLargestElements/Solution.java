import java.util.PriorityQueue;

public class Solution {
    public static void main(String[] args) {
        int[] arr = { 5, 15, 10, 20, 8, 25, 18 };
        int k = 3;
        kLargestElements(arr, k);
    }

    private static void kLargestElements(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            pq.add(arr[i]);
        }
        for (int i = k; i < arr.length; i++) {
            if (pq.peek() < arr[i]) {
                pq.remove();
                pq.add(arr[i]);
            }
        }

        pq.stream().forEach(System.out::println);
    }
}