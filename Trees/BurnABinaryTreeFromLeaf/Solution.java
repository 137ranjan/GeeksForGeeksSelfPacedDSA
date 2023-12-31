public class Solution {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.left.left.left = new Node(60);
        root.left.left.left.left = new Node(70);

        Distance dist = new Distance(-1);
        burnTime(root, 50, dist);
        System.out.println("Time to burn the binary tree from leaf 50: " + res);
    }

    private static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    private static class Distance {
        int val;

        Distance(int val) {
            this.val = val;
        }
    }

    private static int res = 0;

    private static int burnTime(Node root, int leaf, Distance dist) {
        if (root == null) {
            return 0;
        }
        if (root.data == leaf) {
            dist.val = 0;
            return 1;
        }
        Distance lDist = new Distance(-1);
        Distance rDist = new Distance(-1);
        int lh = burnTime(root.left, leaf, lDist);
        int rh = burnTime(root.right, leaf, rDist);
        if (lDist.val != -1) {
            dist.val = lDist.val + 1;
            res = Math.max(res, rh + dist.val);
        } else if (rDist.val != -1) {
            dist.val = rDist.val + 1;
            res = Math.max(res, lh + dist.val);
        }

        return (Math.max(lh, rh) + 1);
    }
}