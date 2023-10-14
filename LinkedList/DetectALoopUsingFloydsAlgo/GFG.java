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
		Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(20);
        Node temp3 = new Node(40);
        Node temp4 = new Node(50);
        Node temp5 = new Node(60);
        Node temp6 = new Node(70);

        head.next = temp1;
        temp1.next = temp2;
        temp2.next = temp3;
        temp3.next = temp4;
        temp4.next = temp5;
        temp5.next = temp6;
        temp6.next = temp4;
        
		Node emptyNode = null;
		boolean result = detectLoop(head);
        // printLinkedList(head);
        System.out.println(result);
	}
	public static boolean detectLoop(Node head){
	   Node fast = head;
	   Node slow = head;
	   
	   while(fast != null && fast.next != null){
	       slow = slow.next;
	       fast = fast.next.next;
	       if(slow == fast){
	           return true;
	       }
	   }
	   
	   return false;
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
