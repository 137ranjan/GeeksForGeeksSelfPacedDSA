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
        Node temp6 = new Node(71);

        head.next = temp1;
        temp1.next = temp2;
        temp2.next = temp3;
        temp3.next = temp4;
        temp4.next = temp5;
        temp5.next = temp6;
        
        Node head2 = new Node(123);
        Node u1 = new Node(124);
        Node u2 = new Node(125);
        
        head2.next = u1;
        u1.next = u2;
        u2.next = temp4;
        
        
		Node emptyNode = null;
		int result = intersection(head, head2);
        // printLinkedList(head);
        System.out.println(result);
	}
	public static int intersection(Node head, Node head2){
	   int count1 = 0;
	   int count2 = 0;
	   Node curr = head;
	   while(curr != null){
	       count1++;
	       curr = curr.next;
	   }
	   Node curr2 = head2;
	   while(curr2 != null){
	       count2++;
	       curr2 = curr2.next;
	   }
	   
	   curr = head;
	   curr2 = head2;
	   
	   if(count1 > count2){
	       for(int i=0; i<Math.abs(count1 - count2); i++){
	           curr = curr.next;
	       }
	   }else{
	       for(int i=0; i<Math.abs(count1 - count2); i++){
	           curr2 = curr2.next;
	       }
	   }
	   
	   while(curr != null && curr2 != null){
	       if(curr == curr2){
	           return curr.data;
	       }
	       curr = curr.next;
	       curr2 = curr2.next;
	   }
	   
	   return -1;
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
