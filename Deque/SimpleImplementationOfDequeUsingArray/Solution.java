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
        private int size;
        private int cap;
        private int[] arr;

        public Deque(int cap) {
            this.cap = cap;
            size = 0;
            arr = new int[cap];
        }

        public boolean isFull() {
            return (size == cap);
        }

        public boolean isEmpty() {
            return (size == 0);
        }

        public void insertRear(int x) {
            if (!isFull()) {
                arr[size] = x;
                size++;
            }
        }

        public void deleteRear() {
            if (!isEmpty()) {
                size--;
            }
        }

        public int getRear() {
            if (isEmpty()) {
                return -1;
            } else {
                return arr[size - 1];
            }
        }

        public void insertFront(int x) {
            if (isFull()) {
                return;
            }
            for (int i = size - 1; i >= 0; i--) {
                arr[i + 1] = arr[i];
            }
            arr[0] = x;
            size++;
        }

        public void deleteFront() {
            if (isEmpty()) return;
            for (int i = 0; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }
            size--;
        }

        public int getFront() {
            if (isEmpty()) return -1;
            else return arr[0];
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            for (int i = 0; i < size; i++) {
                sb.append(arr[i]);
                sb.append(" ");
            }
            sb.append("]");
            return sb.toString();
        }

    }
}
