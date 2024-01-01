public class Solution {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.left.left.left = new Node(80);
        root.left.left.right = new Node(90);
        root.left.right.left = new Node(100);
        root.left.right.right = new Node(110);
        root.right.left = new Node(60);
        root.right.left.left = new Node(120);
        root.right.right = new Node(70);

        System.out.println(countNodes(root));
    }

    private static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    private static int countNodes(Node root) {
        int lh = 0;
        int rh = 0;
        Node curr = root;
        while (curr != null) {
            lh++;
            curr = curr.left;
        }
        curr = root;
        while (curr != null) {
            rh++;
            curr = curr.right;
        }
        if (lh == rh) {
            return (int) Math.pow(2, lh) - 1;
        }
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}
