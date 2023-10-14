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
        
		Node emptyNode = null;
		head = reverseKIterative(head, 3);
        printLinkedList(head);
        // System.out.println(result);
	}
	public static Node reverseKIterative(Node head, int k){
	   // System.out.println("Inside reverseLinkedListRecursive1");
	   Node curr = head;
	   Node prevFirst = null;
	   boolean isFirstPass = true;
	   while(curr != null){
	       Node first = curr;
	       Node prev = null;
	       int count = 0;
	       while(curr != null && count < k){
	            Node next = curr.next;
	            curr.next = prev;
	            prev = curr;
	            curr = next;
	            count++;
	        }
	       if(isFirstPass){
	           head = prev;
	           isFirstPass = false;
	       }else{
	           prevFirst.next = prev;
	       }
	       prevFirst = first;
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
