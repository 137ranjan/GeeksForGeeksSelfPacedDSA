class Solution
{
    int c=0;
    Tree()
    {
        c=0;
    }
    
    //Function to find the sum of nodes in given subtree.
    int countSubtreesWithSumXUtil(Node root,int x)
    { 
    	if (root==null)return 0;
    	
    	//finding sum of nodes in the left and right subtrees recursively.
    	int ls = countSubtreesWithSumXUtil(root.left,x);
    	int rs = countSubtreesWithSumXUtil(root.right, x);
    	
    	
    	int sum = ls + rs + root.data;
    	//if sum of ls, rs and current node data is equal to x,
	    //we increment the counter.
    	if (sum == x)
    	c++;
    	
    	//returning the sum.
    	return sum;
    }

    //Function to count number of subtrees having sum equal to given sum.
    int countSubtreesWithSumX(Node root, int x)
    {
    	if (root==null)return 0;
    	
    	//finding sum of nodes in the left subtrees. 
    	int ls = countSubtreesWithSumXUtil(root.left, x);
    	//finding sum of nodes in the right subtrees.
    	int rs = countSubtreesWithSumXUtil(root.right, x);
    	
    	//if sum of ls, rs and current node data is equal to x,
    	//we increment the counter.
    	if ((ls + rs + root.data) == x)
    	c++;
    	
    	//returning the count.
    	return c;
    }
    
}
