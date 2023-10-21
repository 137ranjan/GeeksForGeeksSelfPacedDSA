class LinkedList
{
    //Function to sort the given doubly linked list using Merge Sort.
	public static Node sortDoubly(Node node)
	{
	    if (node == null || node.next == null) {
            return node;
        }
        
        //splitting the list into two halves. 
        Node second = splitList(node);
 
        //calling the sortDoubly function recursively for both parts separately.
        node = sortDoubly(node);
        second = sortDoubly(second);
 
        //calling the function to merge both halves.
        return merge(node, second);
	}
	
	//Function to split the list into two halves.
	public static Node splitList(Node node)
    {
        //using two pointers to find the midpoint of list.
        Node fast = node, slow = node;
        
        //first pointer, slow moves 1 node and second pointer, fast moves
        //2 nodes in one iteration.
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        //slow is before the midpoint in the list, so we split the 
        //list in two halves from that point.
        Node temp = slow.next;
        slow.next = null;
        return temp;
    }
    
    //Function to merge two halves of list.
    public static Node merge(Node first, Node second)
    {
        //base cases when either of two halves is null.
        if (first == null) {
            return second;
        }
        if (second == null) {
            return first;
        }
 
        //comparing data in both halves and storing the smaller in result and
        //recursively calling the merge function for next node in result.
        if (first.data < second.data) {
            first.next = merge(first.next, second);
            first.next.prev = first;
            first.prev = null;
            //returning the resultant list.
            return first;
        } else {
            second.next = merge(first, second.next);
            second.next.prev = second;
            second.prev = null;
            //returning the resultant list.
            return second;
        }
    }
}
