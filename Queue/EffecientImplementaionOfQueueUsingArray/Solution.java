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

    public static class Queue {
        int[] arr;
        int front, cap, size;

        Queue(int cap) {
            this.cap = cap;
            arr = new int[cap];
            size = 0;
            front = 0;
        }

        boolean isFull() {
            return (size == cap);
        }

        boolean isEmpty() {
            return (size == 0);
        }

        int getFront() {
            if (isEmpty())
                return -1;
            else
                return front;
        }

        int getRear() {
            if (isEmpty())
                return -1;
            else
                return (front + size - 1) % cap;
        }

        void enque(int x) {
            if (isFull())
                return;
            int rear = getRear();
            rear = (rear + 1) % cap;
            arr[rear] = x;
            size++;
        }

        void deque() {
            if (isEmpty()) {
                return;
            }
            front = (front + 1) % cap;
            size--;
        }
    }
}