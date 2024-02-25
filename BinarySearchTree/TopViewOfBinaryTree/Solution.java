import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);

        topViewOfBinaryTree(root);
    }

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    static class Pair {
        Node node;
        int hd;

        Pair(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    static void topViewOfBinaryTree(Node root) {
        Queue<Pair> q = new LinkedList<>();
        Map<Integer, Integer> map = new TreeMap<>();
        q.add(new Pair(root, 0));
        while (!q.isEmpty()) {
            Pair p = q.poll();
            Node curr = p.node;
            int hd = p.hd;
            if (!map.containsKey(hd)) {
                map.put(hd, curr.data);
            }
            if (curr.left != null) {
                q.add(new Pair(curr.left, hd - 1));
            }
            if (curr.right != null) {
                q.add(new Pair(curr.right, hd + 1));
            }
        }
        for (int item : map.values()) {
            System.out.print(item + " ");
        }
    }
}