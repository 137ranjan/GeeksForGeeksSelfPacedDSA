import java.util.PriorityQueue;

public class Solution {
    public static void main(String[] args) {

    }

    void sortKSortedArray(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i <= k; i++) {
            pq.add(arr[i]);
        }
        int index = 0;
        for (int i = k + 1; i < arr.length; i++) {
            arr[index++] = pq.poll();
            pq.add(arr[i]);
        }
        while (pq.isEmpty() == false) {
            arr[index++] = pq.poll();
        }
    }
}