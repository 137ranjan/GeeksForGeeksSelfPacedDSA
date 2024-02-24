public class Solution {
    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(30);
        root.right.left = new Node(18);
        root.right.right = new Node(35);

        System.out.println(isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
        System.out.println(isBST2(root));
    }

    private static class Node {
        int key;
        Node left;
        Node right;

        Node(int key) {
            this.key = key;
        }
    }

    private static boolean isBST(Node root, int min, int max) {
        if (root == null)
            return true;
        return (root.key > min && root.key < max && isBST(root.left, min, root.key)
                && isBST(root.right, root.key, max));
    }

    static int prev = Integer.MIN_VALUE;

    private static boolean isBST2(Node root) {
        if (root == null)
            return true;
        if (isBST2(root.left) == false)
            return false;
        if (root.key <= prev)
            return false;
        prev = root.key;
        return isBST2(root.right);
    }
}