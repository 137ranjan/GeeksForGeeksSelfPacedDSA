class Solution
{
    //Function to check whether a binary tree is foldable or not.
    boolean IsFoldable(Node node) 
	{
	    if(node == null){
	        return true;
	    }
	    return isMirror(node.left, node.right);
	}
	
	boolean isMirror(Node node1, Node node2){
	    if(node1 == null && node2 == null){
	        return true;
	    }
	    if(node1 == null || node2 == null){
	        return false;
	    }
	    return (isMirror(node1.left, node2.right) && isMirror(node1.right, node2.left));
	}
}
