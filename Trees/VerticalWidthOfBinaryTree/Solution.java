class Solution
{
    public static HashSet<Integer>s=new HashSet<Integer>();
    Tree(){
        s.clear();
    }
    
    public static void find(Node root,int l)
    {
        //base case for recursion.
        if(root==null)
        return;
        
        //adding the distance to set.
        s.add(l);
        
        //calling the find function recursively for the left and right subtrees.
        find(root.left,l-1);
        find(root.right,l+1);
    }
    
    //Function to find the vertical width of a Binary Tree.
	public static int verticalWidth(Node root)
	{
	    if(root==null)
	    return 0;
	    find(root,0);
	    //returning the result.
	    return s.size();
	}
}
