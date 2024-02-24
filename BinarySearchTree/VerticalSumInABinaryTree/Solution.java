import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(50);
        root.left.left = new Node(30);
        root.left.right = new Node(40);

        vSum(root);
    }

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    static void vSumR(Node root, int hd, TreeMap<Integer, Integer> map) {
        if (root == null) {
            return;
        }
        vSumR(root.left, hd - 1, map);
        map.put(hd, map.getOrDefault(hd, 0) + root.data);
        vSumR(root.right, hd + 1, map);
    }

    static void vSum(Node root) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        vSumR(root, 0, map);
        for (Map.Entry<Integer, Integer> sum : map.entrySet()) {
            System.out.print(sum.getValue() + " ");
        }
    }
}