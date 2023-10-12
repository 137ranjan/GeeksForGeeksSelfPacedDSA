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
		nthNodeFromEndOfLinkedList(head,0);
        // printLinkedList(head);
        // System.out.println(result);
	}
	public static void nthNodeFromEndOfLinkedList(Node head,int n){
	    if(head == null){
	        return ;
	    }
	    Node first = head;
	    for(int i=0; i<n; i++){
	        if(first == null){
	            return;
	        }
	        first = first.next;
	    }
	    
	    Node second = head;
	    while(first != null){
	        first = first.next;
	        second = second.next;
	    }
	    System.out.println(second.data);
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
