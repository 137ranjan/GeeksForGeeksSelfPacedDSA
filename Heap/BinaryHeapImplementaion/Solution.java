import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap(10);
        minHeap.insert(10);
        minHeap.insert(20);
        minHeap.insert(30);
        minHeap.insert(25);
        minHeap.insert(5);
        minHeap.insert(35);
        System.out.println(minHeap.toString());
    }

    static class MinHeap {
        int[] arr;
        int size;
        int capacity;

        MinHeap(int c) {
            arr = new int[c];
            size = 0;
            capacity = c;
        }

        int left(int i) {
            return (2 * i + 1);
        }

        int right(int i) {
            return (2 * i + 2);
        }

        int parent(int i) {
            return (i - 1) / 2;
        }

        void insert(int x) {
            if (size == capacity) {
                return;
            }
            size++;
            arr[size - 1] = x;
            for (int i = size - 1; i != 0 && arr[parent(i)] > arr[i];) {
                int temp = arr[parent(i)];
                arr[parent(i)] = arr[i];
                arr[i] = temp;
                i = parent(i);
            }
        }

        public String toString() {
            return Arrays.toString(arr);
        }
    }
}