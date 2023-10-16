/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Node{
    int data;
    Node next;
    Node random;
    
    Node(int x){
        data = x;
        next = null;
        random = null;
    }
    
}
class GFG {
	public static void main (String[] args) {
		Node head = new Node(10);
        Node temp1 = new Node(5);
        Node temp2 = new Node(20);
        Node temp3 = new Node(15);
        Node temp4 = new Node(20);
        

        head.next = temp1;
        temp1.next = temp2;
        temp2.next = temp3;
        temp3.next = temp4;
        
        head.random = temp2;
        temp1.random = temp3;
        temp2.random = head;
        temp3.random = temp2;
        temp4.random = temp3;
        
        
        printLinkedList(head);
        System.out.println(" ");
		Node emptyNode = null;
		head = clone(head);
        printLinkedList(head);
        // System.out.println(result);
	}
	public static Node clone(Node head){
	   Node curr = head;
	   while(curr != null){
	       Node next = curr.next;
	       curr.next = new Node(curr.data);
	       curr.next.next = next;
	       curr = next;
	   }
	   
	   for(curr = head; curr != null; curr = curr.next.next){
	       curr.next.random = (curr.random == null)? null : curr.random.next;
	   }
	   
	   Node head2 = head.next;
	   Node clone = head2;
	   for(curr = head; curr != null; curr = curr.next.next){
	       curr.next = curr.next.next;
	       clone.next = clone.next != null ? clone.next.next : null;
	       clone = clone.next;
	   }
	   
	   return head2;
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
