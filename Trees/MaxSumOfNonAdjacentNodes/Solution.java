//Back-end complete function Template for Java

class Pair
{
    int first, second;
    Pair(int first, int second)
    {
        this.first = first;
        this.second = second;
    }
}


class Solution
{
    //Function which returns a pair such that first of the pair 
    //indicates maximum sum when data of a node is included and 
    //the second when it is not included.
    static Pair maxSumHelper(Node root)
    {
        //if root is null, we return two zeroes in pair.
        if (root == null) 
	    { 
		    Pair sum = new Pair(0, 0); 
		    return sum; 
	    } 
	    
	    //calling function recursively for left and right subtrees.
	    Pair sum1 = maxSumHelper(root.left); 
	    Pair sum2 = maxSumHelper(root.right); 
	    Pair sum = new Pair(0, 0); 

	    //current node is included (Left and right children are not included).
	    sum.first = sum1.second + sum2.second + root.data; 

	    //current node is excluded (Either left or right child is included).
	    sum.second = Math.max(sum1.first, sum1.second) + 
				Math.max(sum2.first, sum2.second); 

	    return sum;
    }
    
    //Function to return the maximum sum of non-adjacent nodes.
    static int getMaxSum(Node root)
    {
        Pair res = maxSumHelper(root);
        //returning the maximum between the elements in pair(res).
        return Math.max(res.first, res.second);
    }
}


