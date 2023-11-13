import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.left.left = new Node(21);
        root.left.left.left = new Node(22);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);
        System.out.println(maxWidth(root));
    }

    public static class Node {
        int key;
        Node left;
        Node right;

        Node(int key) {
            this.key = key;
        }
    }

    public static int maxWidth(Node root) {
        if (root == null) {
            return 0;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int res = 0;
        while (q.isEmpty() == false) {
            int count = q.size();
            res = Math.max(res, count);
            for (int i = 0; i < count; i++) {
                Node curr = q.remove();
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
        return res;
    }

}