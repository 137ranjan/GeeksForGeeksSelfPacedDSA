import java.util.Stack;

public class Solution{
	public static void main(String[] args){
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		
		iterativeInorder(root);
	}
	private static class Node{
		int data;
		Node left;
		Node right;
		
		Node(int data){
			this.data = data;
		}
	}
	
	private static void iterativeInorder(Node root){
		Stack<Node> s = new Stack<Node>();
		Node curr = root;
		while(curr != null || s.isEmpty() == false){
			while(curr != null){
				s.push(curr);
				curr = curr.left;
			}
			curr = s.pop();
			System.out.print(curr.data + " ");
			curr = curr.right;
		}
	}	
}
