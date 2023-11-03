public class Solution {
    public static void main(String[] args) {
        Queue q = new Queue();
        System.out.println("isEmpty():" + q.isEmpty());
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

    private static class Node {

        int data;
        Node next;

        public Node(int x) {
            data = x;
        }
    }

    private static class Queue {
        Node front;
        Node rear;
        int size;

        Queue() {
            front = null;
            rear = null;
            size = 0;
        }

        boolean isEmpty() {
            return (size == 0);
        }

        int size() {
            return size;
        }

        int getFront() {
            return front.data;
        }

        int getRear() {
            return rear.data;
        }

        void enque(int x) {
            Node temp = new Node(x);
            if (front == null) {
                front = temp;
                rear = temp;
                size++;
            } else {
                rear.next = temp;
                rear = rear.next;
                size++;
            }
        }

        void deque() {
            if (front == null) {
                return;
            }
            front = front.next;
            if(front == null)
                rear = null;
            size--;
        }

    }
}