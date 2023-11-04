import java.util.ArrayDeque;
import java.util.Queue;

public class Solution {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.toString());
        System.out.println(s.size());
        System.out.println(s.pop());
        System.out.println(s.top());
    }

    public static class Stack {
        private Queue<Integer> q1;
        private Queue<Integer> q2;

        Stack() {
            q1 = new ArrayDeque<>();
            q2 = new ArrayDeque<>();
        }

        int top() {
            return q1.peek();
        }

        int size() {
            return q1.size();
        }

        int pop() {
            return q1.poll();
        }

        void push(int x) {
            while (!q1.isEmpty()) {
                q2.offer(q1.poll());
            }
            q1.offer(x);
            while (!q2.isEmpty()) {
                q1.offer(q2.poll());
            }
        }
    }
}