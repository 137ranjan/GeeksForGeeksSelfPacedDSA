import java.util.ArrayDeque;

public class Solution {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad = new ArrayDeque<>();

        // Stack methods
        ad.push(1);
        ad.peek();
        ad.pop();

        ad.addFirst(2);
        ad.peekFirst();
        ad.removeFirst();

        // Queue methods
        ad.add(3);
        ad.element();
        ad.remove();

        ad.offer(4);
        ad.poll();
        ad.peek();

        ad.addLast(5);
        ad.getFirst();
        ad.removeFirst();

        // Deque methods
        ad.addFirst(6);
        ad.addLast(7);
        ad.getFirst();
        ad.getLast();
        ad.removeFirst();
        ad.removeLast();

        ad.offerFirst(8);
        ad.offerFirst(9);
        ad.peekFirst();
        ad.peekLast();
        ad.pollFirst();
        ad.pollLast();

    }
}