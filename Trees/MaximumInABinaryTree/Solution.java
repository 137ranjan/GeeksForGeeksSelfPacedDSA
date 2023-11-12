public class Solution {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);
        System.out.println(maxInBinaryTree(root));
        System.out.println(maxInBinaryTree(null));
    }

    public static class Node {
        int key;
        Node left;
        Node right;

        Node(int key) {
            this.key = key;
        }
    }

    public static int maxInBinaryTree(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }

        return (Math.max(root.key, Math.max(maxInBinaryTree(root.left), maxInBinaryTree(root.right))));
    }
}