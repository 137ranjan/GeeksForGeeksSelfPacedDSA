/*package whatever //do not write package name here */

import java.io.*;

class Node{
    int data;
    Node prev;
    Node next;
    
    Node(int x){
        data = x;
        prev = null;
        next = null;
    }
    
}
class GFG {
	public static void main (String[] args) {
		Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);

        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.prev = temp1;
        
		Node emptyNode = null;
		head = reverse(head);
        printLinkedList(head);
	}
	
	public static Node reverse(Node head){
	    if(head == null || head.next == null){
	        return head;
	    }
	    Node prev = null;
	    Node curr = head;
	    
	    while(curr != null){
	        prev = curr.prev;
	        curr.prev = curr.next;
	        curr.next = prev;
	        
	        curr = curr.prev;
	    }
	    return prev.prev;
	}
	
	
	public static void printLinkedList(Node head){
	    while(head != null){
	        System.out.print(head.data+" ");
	        head = head.next;
	    }
	}
}
