/*package whatever //do not write package name here */

import java.io.*;

class Node{
    int data;
    Node next;
    
    Node(int x){
        this.data = x;
        next = null;
    }
    
}
class GFG {
	public static void main (String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		Node emptyNode = null;
		Node temp = insertAtBegin(head, 9);
		temp = insertAtEndOfSinglyLinkedList(temp, 32);
        printRecursive(temp);
	}
	
	public static Node insertAtBegin(Node head, int x){
	   Node temp = new Node(x);
       temp.next = head;
	   return temp;
	}
	
	public static Node insertAtEndOfSinglyLinkedList(Node head, int x){
	    Node temp = new Node(x);
	    if(head == null){
	        return temp;
	    }
	    else{
	        Node curr = head;
	        while(curr.next != null){
	            curr = curr.next;
	        }
	        curr.next = temp;
	        return head;
	    }
	}
	
	public static void printRecursive(Node head){
	    if(head == null){
	        return;
	    }
	    System.out.print(head.data+" ");
	    printRecursive(head.next);
	}
}
