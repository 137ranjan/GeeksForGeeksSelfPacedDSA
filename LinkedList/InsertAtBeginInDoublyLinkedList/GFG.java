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
		head = insertBegin(head, 8);
        printLinkedList(head);
	}
	
	public static Node insertBegin(Node head, int x){
	    Node temp = new Node(x);
	    temp.next = head;
	    
	    if(head != null){
	        head.prev = temp;
	    }
	    
	    return temp;
	}
	
	
	public static void printLinkedList(Node head){
	    while(head != null){
	        System.out.print(head.data+" ");
	        head = head.next;
	    }
	}
}
