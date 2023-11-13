public class Solution1 {
    public static void main(String[] args) {
        Node root = new Node(10);

        root.left = new Node(20);
        root.left.left = new Node(21);
        root.left.right = new Node(22);

        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);

        printLeftViewOfBinaryTree(root, 1);
    }

    public static class Node {
        int key;
        Node left;
        Node right;

        Node(int key) {
            this.key = key;
        }
    }

    private static int maxLevel = 0;
    public static void printLeftViewOfBinaryTree(Node root, int level) {
        if (root == null) {
            return;
        }
        if (maxLevel < level) {
            System.out.print(root.key + " ");
            maxLevel = level;
        }
        printLeftViewOfBinaryTree(root.left, level + 1);
        printLeftViewOfBinaryTree(root.right, level + 1);
    }
}