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
		Node a = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        
        a.next = temp1;
        temp1.next = temp2;
        
        Node b = new Node(5);
        b.next = new Node(35);
        
        printLinkedList(a);
        System.out.println(" ");
        printLinkedList(b);
        System.out.println(" ");
		Node emptyNode = null;
		Node head = sortedMerge(a, b);
        printLinkedList(head);
        // System.out.println(result);
	}
	public static Node sortedMerge(Node a, Node b){
	   if(a == null) return b;
	   if(b == null) return a;
	   
	   Node head = null;
	   Node tail = null;
	   
	   if(a.data <= b.data){
	       head = a;
	       tail = a;
	       a = a.next;
	   }else{
	       head = b;
	       tail = b;
	       b = b.next;
	   }
	   
	   while(a != null && b != null){
	       if(a.data <= b.data){
	           tail.next = a;
	           tail = a;
	           a = a.next;
	       }else{
	           tail.next = b;
	           tail = b;
	           b = b.next;
	       }
	   }
	   if(a == null){
	       tail.next = b;
	   }else{
	       tail.next = a;
	   }
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
