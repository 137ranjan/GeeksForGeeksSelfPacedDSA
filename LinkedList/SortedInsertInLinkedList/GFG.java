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
        temp2.next = null;
        
		Node emptyNode = null;
		head = SortedInsertLinkedList(head,32);
        printLinkedList(head);
	}
	public static Node SortedInsertLinkedList(Node head, int x){
	    Node temp = new Node(x);
	    if(head == null){
	        return temp;
	    }
	    if(x < head.data){
	        temp.next = head;
	        return temp;
	    }
	    Node curr = head;
	    while(curr.next != null && curr.next.data < x){
	        curr = curr.next;
	    }
	    temp.next = curr.next;
	    curr.next = temp;
	    return head;
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
