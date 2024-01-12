class GFG
{
    //Function to store the zig zag order traversal of tree in a list.
	ArrayList<Integer> zigZagTraversal(Node root)
	{
	    if(root == null){
	        return null;
	    }
	    ArrayList<Integer> arrList = new ArrayList<>();
	    Queue<Node> q = new LinkedList<>();
	    Stack<Node> s = new Stack<>();
	    boolean leftToRight = true;
	    q.add(root);
	    while(!q.isEmpty()){
	        int count = q.size();
	        for(int i=0; i<count; i++){
	            Node curr = q.remove();
	            if(leftToRight){
	               arrList.add(curr.data);   
	             }else{
	                s.push(curr);
	             }
	             if(curr.left != null){
	                 q.add(curr.left);
	             }
	             if(curr.right != null){
	                 q.add(curr.right);
	             }
	            
	            }
	            while(!s.isEmpty() && !leftToRight){
	                Node curr = s.pop();
	                arrList.add(curr.data);
	            }
	            
	            leftToRight = !leftToRight;
	            
	        }
	        return arrList;
	    }
}
