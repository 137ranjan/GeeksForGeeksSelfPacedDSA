import java.util.Deque;
import java.util.LinkedList;

public class Solution {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.offerFirst(10);
        dq.offerLast(20);
        dq.offerFirst(5);
        dq.offerLast(15);
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());
        dq.pollFirst();
        dq.pollLast();
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());
    }
}