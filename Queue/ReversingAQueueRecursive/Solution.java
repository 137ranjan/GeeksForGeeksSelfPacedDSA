import java.util.ArrayDeque;
import java.util.Queue;

public class Solution {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);

        System.out.println("Original queue: " + q);
        reverseQueueRecursive(q);
        System.out.println("Reversed queue: " + q);
    }

    private static void reverseQueueRecursive(Queue<Integer> q) {
        if (q.isEmpty()) {
            return;
        }
        int item = q.remove();
        reverseQueueRecursive(q);
        q.add(item);
    }
}
