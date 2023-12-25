import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);
        int n1 = 50;
        int n2 = 40;
        Node lca = lca(root, n1, n2);
        System.out.println("LCA for n1=" + n1 + ", n2=" + n2 + " = " + lca.key);
    }

    private static class Node {
        int key;
        Node left;
        Node right;

        Node(int key) {
            this.key = key;
        }
    }

    private static boolean findPath(Node root, ArrayList<Node> path, int n) {
        if (root == null)
            return false;
        path.add(root);
        if (root.key == n)
            return true;
        if (findPath(root.left, path, n) || findPath(root.right, path, n))
            return true;
        path.remove(path.size() - 1);
        return false;
    }

    private static Node lca(Node root, int n1, int n2) {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();
        if (findPath(root, path1, n1) == false || findPath(root, path2, n2) == false)
            return null;
        for (int i = 0; i < path1.size() - 1 && i < path2.size() - 1; i++) {
            if (path1.get(i + 1) != path2.get(i + 1)) {
                return path1.get(i);
            }

        }
        return null;
    }
}