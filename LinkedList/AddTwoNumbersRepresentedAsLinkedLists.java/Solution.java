class Solution{
    //Function to add two numbers represented by linked list.
    static Node addTwoLists(Node first, Node second){
        first = reverseList(first);
        second = reverseList(second);
        
        if(first == null || second == null){
            return null;
        }
        
        int tempData = first.data + second.data;
        int carry = tempData/10;
        tempData = tempData%10;
        
        Node sumList = new Node(tempData);
        Node curr = sumList;
        
        while(first.next != null && second.next != null){
            first = first.next;
            second = second.next;
            tempData = first.data + second.data + carry;
            carry = tempData/10;
            tempData = tempData%10;
            curr.next = new Node(tempData);
            curr = curr.next;
        }
        
        // System.out.println(first.data);
        // System.out.println(second.data);
        // return reverseList(sumList);
        
        if(first.next == null && second.next != null){
            second = second.next;
            tempData = second.data + carry;
            carry = tempData/10;
            tempData = tempData%10;
            curr.next = new Node(tempData);
            curr = curr.next;
            
            while(second.next != null){
            second = second.next;
            tempData = second.data + carry;
            carry = tempData/10;
            tempData = tempData%10;
            curr.next = new Node(tempData);
            curr = curr.next;
            }
        }
        if(second.next == null && first.next != null){
            first = first.next;
            tempData = first.data + carry;
            carry = tempData/10;
            tempData = tempData%10;
            curr.next = new Node(tempData);
            curr = curr.next;
            
            while(first.next != null){
            first = first.next;
            tempData = first.data + carry;
            carry = tempData/10;
            tempData = tempData%10;
            curr.next = new Node(tempData);
            curr = curr.next;
            }
        }
        if(first.next == null && second.next == null && carry != 0){
            curr.next = new Node(carry);
        }
        
        return reverseList(sumList);
        
    }
    
    static Node reverseList(Node head){
        Node prev = null;
        Node curr = head;
        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
