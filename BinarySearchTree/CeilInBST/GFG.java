/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    
	public static void main (String[] args) {
	    Node root = new Node(50);
	    root.left = new Node(30);
	    root.right = new Node(70);
	    root.left.left = new Node(20);
	    root.left.right = new Node(40);
	    root.right.left = new Node(60);
	    root.right.right = new Node(80);
	    root.right.left.left = new Node(55);
	    root.right.left.right = new Node(65);
	    
	    root = ceilInBST(root, 58);
	    if(root == null)
	        System.out.println("null");
	    else
	        System.out.println(root.key);
	    
	}
	
	private static class Node{
	    int key;
	    Node left;
	    Node right;
	    
	    Node(int key){
	        this.key = key;
	    }
	}
	
	private static Node ceilInBST(Node root, int x){
	    Node res = null;
	    Node curr = root;
	    while(curr != null){
	        if(curr.key == x){
	            res = curr;
	            return res;
	        }
	        else if(curr.key < x){
	            curr = curr.right;
	        }
	        else{
	            res = curr;
	            curr = curr.left;
	        }
	    }
	    
	    return res;
	}
	
	
}
