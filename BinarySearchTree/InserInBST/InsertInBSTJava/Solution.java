public class Solution {
    public static void main(String[] args) {
        Node root = null;
        root = insertRecursive(root, 15);
        root = insertRecursive(root, 5);
        root = insertRecursive(root, 3);
        root = insertRecursive(root, 20);
        root = insertRecursive(root, 18);
        root = insertRecursive(root, 16);
        root = insertRecursive(root, 15);

        System.out.println(root.key);
        System.out.println(root.left.key);
        System.out.println(root.right.key);
        System.out.println(root.left.left.key);

        Node root2 = null;
        root2 = insertIterative(root2, 15);
        root2 = insertIterative(root2, 5);
        root2 = insertIterative(root2, 3);
        root2 = insertIterative(root2, 20);
        root2 = insertIterative(root2, 18);
        root2 = insertIterative(root2, 16);
        root2 = insertIterative(root2, 15);

        System.out.println(root2.key);
        System.out.println(root2.left.key);
        System.out.println(root2.right.key);
        System.out.println(root2.left.left.key);

    }

    private static class Node {
        int key;
        Node left;
        Node right;

        Node(int key) {
            this.key = key;
        }
    }

    private static Node insertRecursive(Node root, int x) {
        if (root == null) {
            return new Node(x);
        }
        if (root.key > x) {
            root.left = insertRecursive(root.left, x);
        } else {
            root.right = insertRecursive(root.right, x);
        }

        return root;
    }

    private static Node insertIterative(Node root, int x) {
        Node temp = new Node(x);
        Node parent = null;
        Node curr = root;

        while (curr != null) {
            parent = curr;
            if (curr.key > x) {
                curr = curr.left;
            } else {
                curr = curr.right;
            }
        }

        if (parent == null) {
            return temp;
        }
        if (parent.key > x) {
            parent.left = temp;
        } else {
            parent.right = temp;
        }
        return root;
    }
}