public class Solution {
    public static void main(String[] args) {
        Node root = new Node(18);
        root.left = new Node(60);
        root.right = new Node(70);
        root.left.left = new Node(4);
        root.right.left = new Node(8);
        root.right.right = new Node(80);

        fixBST(root);
        System.out.println(first.key + " " + second.key);
    }

    public static class Node {
        int key;
        Node left;
        Node right;

        Node(int key) {
            this.key = key;
        }
    }

    public static Node prev = null, first = null, second = null;

    public static void fixBST(Node root) {
        if (root == null)
            return;
        fixBST(root.left);
        if (prev != null && root.key < prev.key) {
            if (first == null) {
                first = prev;
            }
            second = root;
        }
        prev = root;
        fixBST(root.right);
    }

}