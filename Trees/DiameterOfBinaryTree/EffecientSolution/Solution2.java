package EffecientSolution;

public class Solution2 {

    private static int result = 0;

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(60);
        root.right.left.left = new Node(60);
        root.right.right.right = new Node(70);
        height(root);
        System.out.println("Diameter = " + result);
    }

    private static class Node {
        int key;
        Node left;
        Node right;

        Node(int key) {
            this.key = key;
        }
    }

    // Effecient Solution
    private static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        result = Math.max(result, 1 + lh + rh);
        return 1 + Math.max(lh, rh);
    }
}
