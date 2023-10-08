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
		int i = searchRecursiveSinglyLinkedList(head, 20);
		System.out.println("i = "+i);
        printLinkedList(head);
	}
	
	public static int searchSinglyLinkedList(Node head, int x){
	    int pos=1;
	    Node curr = head;
	    while(curr.next != null){
	       if(curr.data == x){
	           return pos;
	       }else{
	           pos++;
	           curr = curr.next;   
	       }
	     }
	     return -1;
	}
	
	public static int searchRecursiveSinglyLinkedList(Node head, int x){
	    if(head == null)
	        return -1;
	    if(head.data == x){
	        return 1;
	    }
	    else{
	        int res =  searchRecursiveSinglyLinkedList(head.next, x);
	        if(res == -1)
	            return -1;
	        else
	            return (res + 1);
	    }
	    
	}
	
	public static void printLinkedList(Node head){
	    while(head != null){
	        System.out.print(head.data+" ");
	        head = head.next;
	    }
	}
}
