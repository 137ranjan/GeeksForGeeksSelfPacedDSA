class GfgNew{
 // Function to convert singly linked list to doubly
    static void makeDoubly(Node head){
       
        Node prev = null;
        Node curr = head;
        while(curr != null){
            curr.prev = prev;
            prev = curr;
            curr = curr.next;
        }
    }
}
