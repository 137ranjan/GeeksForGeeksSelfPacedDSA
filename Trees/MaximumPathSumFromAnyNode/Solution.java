class Solution
{
    //Function to return maximum path sum from any node in a tree.
    int maxPathSum;
    
    int findMaxSum(Node node)
    {
        maxPathSum = Integer.MIN_VALUE;
        maxPathSumHelper(node);
        return maxPathSum;
    }
    
    int maxPathSumHelper(Node root){
        if(root == null){
            return 0;
        }
        
        int leftSum = Math.max(maxPathSumHelper(root.left), 0);
        int rightSum = Math.max(maxPathSumHelper(root.right), 0);
        maxPathSum = Math.max(maxPathSum, root.data + leftSum + rightSum);
        
        return root.data + Math.max(leftSum, rightSum);
    }
}
