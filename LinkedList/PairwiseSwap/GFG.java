/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

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
		Node head = new Node(9);
        Node temp1 = new Node(20);
        Node temp2 = new Node(21);
        Node temp3 = new Node(40);
        Node temp4 = new Node(51);
        Node temp5 = new Node(60);
        

        head.next = temp1;
        temp1.next = temp2;
        temp2.next = temp3;
        temp3.next = temp4;
        temp4.next = temp5;
        
        
        printLinkedList(head);
        System.out.println(" ");
		Node emptyNode = null;
		head = pairwiseSwap(head);
        printLinkedList(head);
        // System.out.println(result);
	}
	public static Node pairwiseSwap(Node head){
	   if(head == null || head.next == null)
	       return head;
	   Node curr = head.next.next;
	   Node prev = head;
	   head = head.next;
	   head.next = prev;
	   
	   while(curr != null && curr.next != null){
	       prev.next = curr.next;
	       prev = curr;
	       Node next = curr.next.next;
	       curr.next.next = curr;
	       curr = next;
	   }
	   prev.next = curr;
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
