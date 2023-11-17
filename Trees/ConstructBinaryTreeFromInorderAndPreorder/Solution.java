import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public static void main(String[] args) {
        int[] inorder = { 20, 10, 40, 30, 50 };
        int[] preorder = { 10, 20, 30, 40, 50 };

        Node root = constructTree(inorder, preorder, 0, preorder.length - 1);

        levelOrder(root);

    }

    private static class Node {
        int key;
        Node left;
        Node right;

        public Node(int key) {
            this.key = key;
        }
    }

    private static int preIndex = 0;

    private static Node constructTree(int[] in, int[] pre, int is, int ie) {
        if (is > ie) {
            return null;
        }

        Node root = new Node(pre[preIndex]);
        preIndex++;

        int inIndex = 0;
        for (int i = is; i <= ie; i++) {
            if (in[i] == root.key) {
                inIndex = i;
                break;
            }
        }

        root.left = constructTree(in, pre, is, inIndex - 1);
        root.right = constructTree(in, pre, inIndex + 1, ie);
        return root;

    }

    private static void levelOrder(Node root) {
        Queue<Node> q = new LinkedList<>();
        if (root == null) {
            return;
        }
        q.offer(root);
        while (q.isEmpty() == false) {
            int count = q.size();
            for (int i = 0; i < count; i++) {
                Node curr = q.poll();
                System.out.print(curr.key + " ");
                if (curr.left != null) {
                    q.offer(curr.left);
                }
                if (curr.right != null) {
                    q.offer(curr.right);
                }
            }
            System.out.println("");
        }
    }

}