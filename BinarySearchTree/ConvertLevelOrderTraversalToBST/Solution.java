class Solution 
{
    class QNode 
    {
        Node node;
        int min, max;
        public QNode(Node node){
            this.node = node;
            this.min = Integer.MIN_VALUE;
            this.max = Integer.MAX_VALUE;
        }
    }
    
    //Function to construct the BST from its given level order traversal.
    public Node constructBST(int[] arr)
    {
        //getting the root of the BST
        Node root = new Node(arr[0]);
        
        //using a queue to store NodeDetails of a node.
        Queue<QNode> q = new LinkedList<>();
        q.add(new QNode(root));
        
        QNode curr;
        
        for(int i=1; i<arr.length;)
        {
            //extracting NodeDetails of a node from the queue.
            curr = q.poll();

            //checking whether there are more elements in the arr[] and arr[i] 
            //can be left child of curr.node or not.
            if(i<arr.length&&arr[i]<curr.node.data &&arr[i]>curr.min)
            {
                //making this newNode as left child of curr.node.
                Node leftNode = new Node(arr[i]);
                curr.node.left = leftNode;
                
                //creating NodeDetails for new node and adding it to the queue.
                QNode newQnode = new QNode(leftNode);
                newQnode.min = curr.min;
                newQnode.max = curr.node.data;
                q.add(newQnode);
                i++;
            } 
            
            //checking whether there are more elements in the arr[] and arr[i] 
            //can be right child of curr.node or not.
            if (i<arr.length&& arr[i]>curr.node.data&&arr[i]<curr.max)
            {
                //making this newNode as right child of curr.node.
                Node rightNode = new Node(arr[i]);
                curr.node.right = rightNode;
                
                //creating NodeDetails for new node and adding it to the queue.
                QNode newQnode = new QNode(rightNode);
                newQnode.min = curr.node.data;
                newQnode.max = curr.max;
                q.add(newQnode);
                i++;
            }
        }
        //returning root of the required BST.
        return root;
    }
}
