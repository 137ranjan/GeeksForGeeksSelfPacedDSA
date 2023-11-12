public class Solution {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);
        System.out.println(sizeOfBinaryTree(root));
    }

    public static class Node {
        int key;
        Node left;
        Node right;

        Node(int key) {
            this.key = key;
        }
    }

    public static int sizeOfBinaryTree(Node root) {
        if (root == null) {
            return 0;
        }
        return (sizeOfBinaryTree(root.left) + sizeOfBinaryTree(root.right) + 1);
    }
}