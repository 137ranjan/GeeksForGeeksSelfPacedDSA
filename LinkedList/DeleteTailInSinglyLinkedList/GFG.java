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
		head = deleteTailSinglyLinkedList(head);
        printLinkedList(head);
	}
	
	public static Node deleteTailSinglyLinkedList(Node head){
	    if(head == null)
	        return null;
	    if(head.next == null)
	        return null;
	        
	    Node curr = head;
	    while(curr.next.next != null){
	       curr = curr.next;
	     }
	     curr.next = null;
	     return head;
	}
	
	public static void printLinkedList(Node head){
	    while(head != null){
	        System.out.print(head.data+" ");
	        head = head.next;
	    }
	}
}
