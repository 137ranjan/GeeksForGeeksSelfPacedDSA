class Solution
{
   class Res 
    {
        int r = Integer.MIN_VALUE;
    }
    
    //Function to find the maximum difference.
    int maxDiffUtil(Node t,Res res)
    {
        //returning Maximum int value if node is null.
        if (t == null) 
            return Integer.MAX_VALUE; 
           
        //if there are no child nodes then we just return data at current node.
        if (t.left == null && t.right == null) 
            return t.data; 
   
        //recursively calling for left and right subtrees and 
        //choosing their minimum.
        int val = Math.min(maxDiffUtil(t.left, res), 
                maxDiffUtil(t.right, res)); 
   
        //updating res if (node value - min value from subtrees) 
        //is bigger than res.
        res.r = Math.max(res.r, t.data - val); 
   
        //returning minimum value got so far.
        return Math.min(val, t.data); 
    }

    //Function to return the maximum difference between any 
    //node and its ancestor.
    int maxDiff(Node root)
    {
        Res res = new Res();
        maxDiffUtil(root, res);
        //returning the result.
        return res.r;
    }
}
