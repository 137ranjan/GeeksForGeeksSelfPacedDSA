/*package whatever //do not write package name here */

import java.io.*;

class Node{
    private int data;
    private Node next;
    
    public Node(int x){
        this.data = x;
        next = null;
    }
    public int getData(){
        return this.data;
    }
    public void setData(int x){
        this.data = x;
    }
    public Node getNext(){
        return this.next;
    }
    public void setNext(Node x){
        this.next = x;
    }
}
class GFG {
	public static void main (String[] args) {
		Node head = new Node(10);
		head.setNext(new Node(20));
		head.getNext().setNext(new Node(30));
		
		Node temp = head;
		while(temp != null){
		    System.out.print(temp.getData()+", ");
		    temp = temp.getNext();
		}
	}
}
