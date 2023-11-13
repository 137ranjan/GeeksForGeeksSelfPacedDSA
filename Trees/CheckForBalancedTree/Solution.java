public class Solution {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.left.left = new Node(21);
        root.left.left.left = new Node(22);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);
        System.out.println(isBalanced(root));
    }

    public static class Node {
        int key;
        Node left;
        Node right;

        Node(int key) {
            this.key = key;
        }
    }

    /*
     * a binary tree is balanced when difference in height of left and right subtree
     * is <= 1
     */
    public static boolean isBalanced(Node root) {
        if (root == null) {
            return true;
        }
        int lh = heightOfBinaryTree(root.left);
        int rh = heightOfBinaryTree(root.right);
        return (Math.abs(lh - rh) <= 1 && isBalanced(root.left) && isBalanced(root.right));
    }

    public static int heightOfBinaryTree(Node root) {
        if (root == null) {
            return 0;
        } else {
            return (Math.max(heightOfBinaryTree(root.left), heightOfBinaryTree(root.right)) + 1);
        }
    }
}