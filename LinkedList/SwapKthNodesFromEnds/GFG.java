class GFG
{
    //Function to swap Kth node from beginning and end in a linked list.
    Node swapkthnode(Node head, int num, int K)
    {
        //if k is more than number of nodes or kth node from beginning 
        //and end are same, we return the list.
        if(K > num) return head;
         if(2*K-1 == num) return head;
    
        Node x_prev = null;
        Node x = head;
    
        Node y_prev = null;
        Node y = head;
    
        int count = K-1;
        //finding the kth node from the beginning of list. We also find node
        //previous of kth node because we need to update next pointer of 
        // the previous node.
        while(count-- > 0){
        x_prev = x;
        x = x.next;
        }
    
        count = num - K;
        //similarly, finding the kth node from end and its previous node. kth
        //node from end is (num-k+1)th node from beginning .
        while(count-- > 0){
        y_prev = y;
        y = y.next;
        }
        
        //if x_prev exists, then new next of it will be y.
        if(x_prev != null)
            x_prev.next = y;
        //if y_prev exists, then new next of it will be x.
        if(y_prev != null)
            y_prev.next = x;
        
        //we will swap the next pointers of x and y.
        Node temp = x.next;
        x.next = y.next;
        y.next = temp;
        
        //changing head pointers when k is 1 or num.
        if(K == 1)
         head = y;
        if(K == num)
            head = x;
            
        return head;    
    }
}
