public class Solution2 {
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

    private static int isBalanced(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = isBalanced(root.left);
        if (lh == -1) {
            return -1;
        }
        int rh = isBalanced(root.right);
        if (rh == -1) {
            return -1;
        }
        if (Math.abs(lh - rh) > 1) {
            return -1;
        } else {
            return Math.max(lh, rh) + 1;
        }
    }

}
