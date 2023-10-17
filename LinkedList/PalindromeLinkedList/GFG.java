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
        Node temp3 = new Node(10);
        
        head.next = temp1;
        temp1.next = temp2;
        temp2.next = temp3;
        
        printLinkedList(head);
        System.out.println(" ");
        
		boolean result = isPalindrome(head);
        // printLinkedList(head);
        System.out.println(result);
	}
	
	public static boolean isPalindrome(Node head){
	   if(head == null) return true;
	   
	   Node slow = head;
	   Node fast = head;
	   
	   while(fast != null){
	       slow = slow.next;
	       fast = fast.next.next;
	   }
	   
	   Node rev = reverseList(slow.next);
	   
	   Node curr = head;
	   while(rev != null){
	       if(rev.data != curr.data){
	           return false;
	       }
	       rev = rev.next;
	       curr = curr.next;
	   }
	   
	   return true;
	}
	
	public static Node reverseList(Node head){
	    Node prev = null;
	    Node curr = head;
	    
	    while(curr != null){
	        Node next = curr.next;
	        curr.next = prev;
	        prev = curr;
	        curr = next;
	    }
	    
	    return prev;
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
