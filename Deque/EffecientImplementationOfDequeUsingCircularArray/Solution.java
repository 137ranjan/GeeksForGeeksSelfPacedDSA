public class Solution {
    public static void main(String[] args) {
        Deque dq = new Deque(10);
        dq.insertRear(10);
        System.out.println(dq.toString());
        dq.insertRear(20);
        System.out.println(dq.toString());
        dq.insertFront(90);
        System.out.println(dq.toString());
        dq.insertFront(100);
        System.out.println(dq.toString());
        System.out.println("front: " + dq.getFront());
        System.out.println("rear: " + dq.getRear());
        dq.deleteRear();
        System.out.println(dq.toString());
        dq.deleteFront();
        System.out.println(dq.toString());
        System.out.println("front: " + dq.getFront());
        System.out.println("rear: " + dq.getRear());
    }

    private static class Deque {
        private int front;
        private int size;
        private int cap;
        private int[] arr;

        public Deque(int cap) {
            this.cap = cap;
            front = 0;
            size = 0;
            arr = new int[cap];
        }

        public boolean isFull() {
            return (size == cap);
        }

        public boolean isEmpty() {
            return (size == 0);
        }

        public void deleteFront() {
            if (isEmpty()) {
                return;
            }
            front = (front + 1) % cap;
            size--;
        }

        public void insertRear(int x) {
            if (isFull()) {
                return;
            }
            int newRear = (front + size) % cap;
            arr[newRear] = x;
            size++;
        }

        public int getFront() {
            if (isEmpty()) {
                return -1;
            } else {
                return front;
            }
        }

        public void insertFront(int x) {
            if (isFull()) {
                return;
            }
            front = (front + cap - 1) % cap;
            arr[front] = x;
            size++;
        }

        public void deleteRear() {
            if (isEmpty()) {
                return;
            }
            size--;
        }

        public int getRear() {
            if (isEmpty()) {
                return -1;
            } else {
                return (front + size - 1) % cap;
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("[ ");
            for (int i = 0; i < cap; i++) {
                sb.append(arr[i]);
                sb.append(" ");
            }
            sb.append("]");
            return sb.toString();
        }

    }
}