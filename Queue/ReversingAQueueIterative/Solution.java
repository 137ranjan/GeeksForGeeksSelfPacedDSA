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
        q = reverseQueue(q);

        System.out.println("Reversed queue: " + q);

    }

    private static Queue<Integer> reverseQueue(Queue<Integer> q) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        while (!q.isEmpty()) {
            stack.push(q.remove());
        }
        while (!stack.isEmpty()) {
            q.add(stack.pop());
        }
        return q;
    }
}