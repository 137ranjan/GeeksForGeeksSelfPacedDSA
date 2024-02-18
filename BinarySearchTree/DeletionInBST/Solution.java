public class Solution {
    public static void main(String[] args) {
        Node root = new Node(15);
        root.left = new Node(5);
        root.right = new Node(20);
        root.left.left = new Node(3);
        root.right.left = new Node(18);
        root.right.right = new Node(80);
        root.right.left.left = new Node(16);

        root = deleteInBST(root, 15);
        System.out.println(root.key);
    }

    private static class Node {
        int key;
        Node left;
        Node right;

        Node(int key) {
            this.key = key;
        }
    }

    private static Node getSucc(Node curr) {
        curr = curr.right;
        while (curr != null && curr.left != null) {
            curr = curr.left;
        }
        return curr;
    }

    private static Node deleteInBST(Node root, int x) {
        if (root == null) {
            return root;
        }
        if (root.key > x) {
            root.left = deleteInBST(root.left, x);
        } else if (root.key < x) {
            root.right = deleteInBST(root.right, x);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                Node succ = getSucc(root);
                root.key = succ.key;
                root.right = deleteInBST(root.right, succ.key);
            }
        }
        return root;
    }
}