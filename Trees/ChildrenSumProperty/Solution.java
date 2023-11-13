public class Solution {
    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(1);

        root.right = new Node(2);
        root.right.left = new Node(1);
        root.right.right = new Node(2);

        System.out.println(isSum(root));
    }

    private static class Node {
        int key;
        Node left;
        Node right;

        Node(int key) {
            this.key = key;
        }
    }

    private static boolean isSum(Node root) {
        if (root == null) {
            return true;
        }
        if (root.left == null && root.right == null) {
            return true;
        }
        int sum = 0;
        if (root.left != null) {
            sum += root.left.key;
        }
        if (root.right != null) {
            sum += root.right.key;
        }

        return (root.key == sum && isSum(root.left) && isSum(root.right));
    }
}