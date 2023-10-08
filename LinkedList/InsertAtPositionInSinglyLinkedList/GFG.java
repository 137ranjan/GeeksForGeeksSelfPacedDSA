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
		head = insertAtPositionInSinglyLinkedList(head, 2, 9);
        printLinkedList(head);
	}
	
	public static Node insertAtPositionInSinglyLinkedList(Node head, int pos, int data){
	    
	    Node temp = new Node(data);
	    
	    if(pos == 1){
	        temp.next = head;
	        return temp;
	    }
	    
	    Node curr = head;
	    for(int i=1; i <= pos-2 && curr != null; i++){
	        curr = curr.next;
	    }
	    if(curr == null){
	        return head;
	    }
	    temp.next = curr.next;
	    curr.next = temp;
	    return head;
	}
	
	public static void printLinkedList(Node head){
	    while(head != null){
	        System.out.print(head.data+" ");
	        head = head.next;
	    }
	}
}
