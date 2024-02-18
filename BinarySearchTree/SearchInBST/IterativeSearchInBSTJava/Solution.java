public class Solution {
    public static void main(String[] args) {
        Node root = new Node(15);
        root.left = new Node(5);
        root.right = new Node(20);
        root.left.left = new Node(3);
        root.right.left = new Node(18);
        root.right.right = new Node(80);
        root.right.left.left = new Node(16);

        System.out.println(search(root, 16));
    }

    static class Node {
        int key;
        Node left;
        Node right;

        Node(int key) {
            this.key = key;
        }
    }

    public static boolean search(Node root, int x) {
        while (root != null) {
            if (root.key == x) {
                return true;
            }
            if (root.key > x) {
                root = root.left;
            } else {
                root = root.right;
            }
        }
        return false;
    }
}
