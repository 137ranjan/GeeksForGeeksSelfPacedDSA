import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(8);
        root.right = new Node(9);
        root.left.left = new Node(4);
        root.left.right = new Node(9);
        root.right.left = new Node(11);
        root.right.right = new Node(30);
        root.right.left = new Node(25);
        HashSet<Integer> set1 = new HashSet<>();
        System.out.println(pairSum(root, 33, set1));

        Node root2 = new Node(20);
        root2.left = new Node(8);
        root2.right = new Node(40);
        root2.right.left = new Node(35);

        HashSet<Integer> set2 = new HashSet<>();
        System.out.println(pairSum(root2, 49, set2));
    }

    private static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    private static boolean pairSum(Node root, int sum, HashSet<Integer> set) {
        if (root == null)
            return false;
        if (pairSum(root.left, sum, set))
            return true;
        if (set.contains(sum - root.data))
            return true;
        else
            set.add(root.data);
        return pairSum(root.right, sum, set);
    }

}