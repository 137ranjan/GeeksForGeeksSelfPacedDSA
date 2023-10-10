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

        head.next = temp1;
        temp1.next = temp2;
        temp2.next = head;
        
		Node emptyNode = null;
		head = deleteHeadCircularLinkedList(head);
        printCircularLinkedList(head);
	}
	public static Node deleteHeadCircularLinkedList(Node head){
	    if(head == null){
	        return null;
	    }
	    if(head.next == null){
	        return null;
	    }
	    head.data = head.next.data;
	    head.next = head.next.next;
	    return head;
	}
	
	public static void printCircularLinkedList(Node head){
	    if(head == null){
	        return;
	    }
	    Node curr = head;
	    do {
	        System.out.print(curr.data+" ");
	        curr = curr.next;
	    } while(curr != head);
	}
}
