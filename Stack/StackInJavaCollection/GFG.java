/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
    
class GFG {
	public static void main (String[] args) {
	   // Stack<Integer> stack = new Stack<>();
	    ArrayDeque<Integer> stack = new ArrayDeque<>();
	    stack.push(10);
	    stack.push(20);
	    stack.push(30);
	    stack.push(40);
	    
	    System.out.println(stack.isEmpty());
	    System.out.println(stack.size());
	    System.out.println(stack.peek());
	    System.out.println(stack.pop());
	    System.out.println(stack.pop());
	    System.out.println(stack.pop());
	    System.out.println(stack.pop());
	    System.out.println(stack.isEmpty());
	    
	}
}
