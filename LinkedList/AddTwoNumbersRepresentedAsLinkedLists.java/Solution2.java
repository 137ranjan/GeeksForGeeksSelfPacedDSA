class Solution{
    //Function to reverse the linked list.
    static Node reverse(Node head){
        Node prev = null;
        Node curr = head;
        Node next = null;
        
        while(curr != null)
        {
            next = curr.next;     
            curr.next = prev;     
            prev = curr;          
            curr = next;        
        }
        
        return prev;
    }
    //Function to add two numbers represented by linked list.
    static Node addTwoLists(Node first, Node second){
        
        //reversing both lists to simplify addition.
        first = reverse(first);      
        second = reverse(second);     
        
        Node sum = null;
        int carry = 0;
        
        //using a loop till both lists and carry gets exhausted.
        while( first!=null || second!=null || carry>0 )
        {
            //using a variable to store sum of two digits along with carry.
            int newVal = carry;
            
            //if nodes are left in any list, we add their data in newVal.
            if(first!=null) newVal+=first.data;
            if(second!=null) newVal+=second.data;
            
            //updating carry.
            carry = newVal / 10;
            
            //using modulus to store only a single digit at that place.
            newVal = newVal % 10;
            
            //creating new node which gets connected with other nodes that 
            //we get after calculating sum of respective digits.
            Node newNode = new Node(newVal);
            
            //storing the previously made nodes in the link part of new node.
            newNode.next = sum;
            //making the new node as the first node of all previously made node.
            sum = newNode;
            
            //moving ahead in both lists.
            if(first!=null) first = first.next;      
            if(second!=null) second = second.next;
        }
        
        return sum;
    }
}
