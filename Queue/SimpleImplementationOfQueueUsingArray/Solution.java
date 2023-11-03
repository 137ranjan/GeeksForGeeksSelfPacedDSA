public class Solution {
    public static void main(String[] args) {
        Queue q = new Queue(10);
        System.out.println("isEmpty():" + q.isEmpty());
        System.out.println("isFull():" + q.isFull());
        q.enque(0);
        q.enque(1);
        q.enque(2);
        q.enque(3);
        q.enque(4);
        q.enque(5);
        q.deque();
        System.out.println("front:" + q.getFront());
        System.out.println("rear:" + q.getRear());

    }

    private static class Queue {
        private int size;
        private int cap;
        private int[] arr;

        Queue(int cap) {
            this.cap = cap;
            this.size = 0;
            this.arr = new int[cap];
        }

        boolean isEmpty() {
            return (size == 0);
        }

        boolean isFull() {
            return (size == cap);
        }

        void enque(int x) {
            if (isFull()) {
                return;
            }
            arr[size] = x;
            size++;
        }

        void deque() {
            if (isEmpty())
                return;
            for (int i = 0; i < size; i++)
                arr[i] = arr[i + 1];
            size--;
        }

        int getFront() {
            if (isEmpty())
                return -1;
            else
                return 0;
        }

        int getRear() {
            if (isEmpty())
                return -1;
            else
                return size - 1;
        }
    }
}