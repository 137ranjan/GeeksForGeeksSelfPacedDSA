class Solution {
    
    //Function to insert a node in the middle of the linked list.
    public Node insertInMid(Node head, int data){
        
        //if list is empty, we just return the new node.
        if (head == null)
           return (new Node(data));
    	else { 
            //creating new node.
            Node toAdd = new Node(data);
            
            //we take two pointers one of which moves to next node in each
		    //iteration and the other moves two nodes in one iteration.
            Node slow = head, fast = head; 
            
            //when fast will reach end, slow will be at the middle point. 
            while(fast.next != null && fast.next.next != null){
                slow = slow.next;                               
                fast = fast.next.next;                          
            }                          
                 
            //we store the next node after slow in link part of the new node.
            toAdd.next = slow.next;
            //we also store the new node in link part of the slow node.
            slow.next = toAdd;                                   
                
            return head;
    	}
    }
}
