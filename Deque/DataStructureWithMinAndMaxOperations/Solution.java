import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public static void main(String[] args) {
        MinMaxDs m = new MinMaxDs();
        m.insertMax(5);
        m.insertMax(6);
        m.insertMin(4);
        m.insertMin(3);

        System.out.println(m.getMin());
        System.out.println(m.getMax());

        System.out.println(m.extractMax());
        System.out.println(m.extractMin());
    }

    public static class MinMaxDs {
        private Deque<Integer> dq;

        public MinMaxDs() {
            dq = new ArrayDeque<>();
        }

        void insertMin(int item) {
            dq.offerFirst(item);
        }

        void insertMax(int item) {
            dq.offerLast(item);
        }

        int getMin() {
            return dq.peekFirst();
        }

        int getMax() {
            return dq.peekLast();
        }

        int extractMin() {
            return dq.pollFirst();
        }

        int extractMax() {
            return dq.pollLast();
        }

    }
}