public class Solution {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);

        int n1 = 40;
        int n2 = 50;
        Node lca = lca(root, n1, n2);
        System.out.println("LCA for n1=" + n1 + ", n2=" + n2 + " is " + lca.key);
    }

    private static class Node {
        int key;
        Node left;
        Node right;

        Node(int key) {
            this.key = key;
        }
    }

    // Assuming n1 and n2 are present in tree
    private static Node lca(Node root, int n1, int n2) {
        if (root == null)
            return null;
        if (root.key == n1 || root.key == n2)
            return root;
        Node lca1 = lca(root.left, n1, n2);
        Node lca2 = lca(root.right, n1, n2);

        if (lca1 != null && lca2 != null) {
            return root;
        }

        if (lca1 != null) {
            return lca1;
        } else {
            return lca2;
        }
    }
}