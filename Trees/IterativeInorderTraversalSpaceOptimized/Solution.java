import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.left.left.left = new Node(70);
        root.left.left.right = new Node(80);
        root.right.left = new Node(60);

        iterativePreorder(root);

    }

    private static class Node {
        int key;
        Node left;
        Node right;

        Node(int key) {
            this.key = key;
        }
    }

    private static void iterativePreorder(Node root) {
        if (root == null) {
            return;
        }
        Stack<Node> st = new Stack<>();
        Node curr = root;
        while (curr != null || st.isEmpty() == false) {
            while (curr != null) {
                System.out.print(curr.key + " ");
                if (curr.right != null) {
                    st.push(curr.right);
                }
                curr = curr.left;
            }
            if (st.isEmpty()) {
                curr = st.pop();
            }
        }
    }
}