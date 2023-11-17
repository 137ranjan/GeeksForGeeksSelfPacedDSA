public class Solution {
    public static void main(String[] args) {
        // create a binary tree with root Node key value 10
        Node root = new Node(10);

        // create left subtree of binary tree
        root.left = new Node(5);

        // create right subtree of binary tree
        root.right = new Node(20);
        root.right.left = new Node(30);
        root.right.right = new Node(35);

        // convert binary tree to doubly linked list
        Node head = binaryTreeToDoublyLikedList(root);

        // traverse the doubly linked list and print its elements
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.key + " ");
            temp = temp.right;
        }
    }

    // Node class declaration
    private static class Node {
        int key;
        Node left;
        Node right;

        Node(int key) {
            this.key = key;
        }
    }

    // previous node declared and initaialized as null
    private static Node prev = null;

    // function to convert binary tree to doubly linkedList
    private static Node binaryTreeToDoublyLikedList(Node root) {
        if (root == null) {
            return root;
        }
        // call for left subtree
        Node head = binaryTreeToDoublyLikedList(root.left);
        // set leftmost item to head
        if (prev == null) {
            head = root;
        } else {
            root.left = prev;
            prev.right = root;
        }
        prev = root;
        binaryTreeToDoublyLikedList(root.right);
        return head;
    }
}