class Solution
{
    //Function to merge K sorted linked list.
    Node mergeKList(Node[]arr,int K)
    {
        Node result = null;
        for(int i=0; i<arr.length; i++){
            result = sortedMerge(result,arr[i]);
        }
        return result;
    }
    
    Node sortedMerge(Node head1, Node head2){
        Node dummyNode = new Node(0);
        Node tail = dummyNode;
        
        while(true){
            if(head1 == null){
                tail.next = head2;
                break;
            }
            if(head2 == null){
                tail.next = head1;
                break;
            }
            if(head1.data < head2.data){
                tail.next = head1;
                head1 = head1.next;
            }else{
                tail.next = head2;
                head2 = head2.next;
            }
            tail = tail.next;
        }
        
        return dummyNode.next;
    }
}
