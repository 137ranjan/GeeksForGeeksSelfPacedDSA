import java.util.Deque;
import java.util.LinkedList;

public class Solution {

    public static void main(String[] args) {
        int[] arr = { 10, 8, 5, 12, 15, 7, 6 };
        int n = arr.length;
        int k = 3;
        printMaxK(arr, n, k);
    }

    private static void printMaxK(int[] arr, int n, int k) {
        Deque<Integer> dq = new LinkedList<>();

        // For first window of k items
        for (int i = 0; i < k; i++) {
            while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]) {
                dq.removeLast();
            }
            dq.addLast(i);
        }

        // For rest of the items
        for (int i = k; i < n; i++) {
            System.out.print(arr[dq.peekFirst()] + " ");
            while (!dq.isEmpty() && dq.peek() <= i - k) {
                dq.removeFirst();
            }
            while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]) {
                dq.removeLast();
            }
            dq.addLast(i);
        }

        System.out.print(arr[dq.peek()] + " ");
    }
}