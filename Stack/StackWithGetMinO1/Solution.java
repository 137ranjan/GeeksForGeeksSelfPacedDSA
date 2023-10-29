import java.util.ArrayDeque;

public class Solution {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(5);
        s.push(10);
        s.push(20);
        s.push(2);
        s.push(6);
        s.push(4);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        s.push(2);
        System.out.println(s.pop());
        s.push(1);
        System.out.println(s.pop());
        System.out.println(s.pop());
    }

    public static class Stack {
        ArrayDeque<Integer> stack;
        int min;

        Stack() {
            this.stack = new ArrayDeque<>();
        }

        public int getMin() {
            return min;
        }

        public int peek() {
            int t = stack.peek();
            return (t <= min) ? min : t;
        }

        public int pop() {
            int t = stack.pop();
            if (t <= min) {
                int res = min;
                min = 2 * min - t;
                return res;
            } else {
                return t;
            }
        }

        public void push(int x) {
            if (stack.isEmpty()) {
                min = x;
                stack.push(x);
            } else if (x <= min) {
                stack.push(2 * x - min);
                min = x;
            } else {
                stack.push(x);
            }
        }
    }
}