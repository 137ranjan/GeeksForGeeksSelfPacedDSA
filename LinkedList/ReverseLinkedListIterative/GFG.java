/*package whatever //do not write package name here */

import java.io.*;

class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
    
}
class GFG {
	public static void main (String[] args) {
		Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        Node temp3 = new Node(40);

        head.next = temp1;
        temp1.next = temp2;
        temp2.next = temp3;
        temp3.next = null;
        
		Node emptyNode = null;
		head = reverseLinkedListIterative(head);
        printLinkedList(head);
        // System.out.println(result);
	}
	public static Node reverseLinkedListIterative(Node head){
	  
	    Node prev = null;
	    Node curr = head;
	    while(curr != null){
	        Node next = curr.next;
	        curr.next = prev;
	        prev = curr;
	        curr = next;
	    }
	    return prev;
	     
	}
	
	
	public static void printLinkedList(Node head){
	    if(head == null){
	        return;
	    }
	    Node curr = head;
	    while(curr != null){
	        System.out.print(curr.data+" ");
	        curr = curr.next;
	    }
	}
}
