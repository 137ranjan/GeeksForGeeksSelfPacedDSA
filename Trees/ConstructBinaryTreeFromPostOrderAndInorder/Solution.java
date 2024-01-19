
class Solution {
    static int pIndex = 0;

    //Function to construct binary tree from postorder and inorder traversals.
    Node buildTreeUtil(int[] inOrder, int[] postOrder, int iStart, int iEnd,
                       int postStart, int postEnd) 
    {
        //base case
        if (iStart > iEnd) 
        {
            return null;
        }

        //picking current node from postorder traversal using postIndex
        //and decrementing postIndex.
        int rootValue = postOrder[postEnd];
        Node root = new Node(rootValue);
        pIndex++;

        //if this node has no children then we return the node.
        if (iStart == iEnd)
        {
            return root;
        }
        //else we find the index of this node in inorder traversal.
        int index = getInorderIndex(inOrder, iStart, iEnd, root.data);

        //using index in inorder traversal, we construct right and left 
        //subtrees by calling the function buildTreeUtil recursively.
        root.left = buildTreeUtil(inOrder, postOrder, iStart, index - 1,
                                  postStart, postStart + index - (iStart + 1));
        root.right = buildTreeUtil(inOrder, postOrder, index + 1, iEnd,
                                   postStart + index - iStart, postEnd - 1);

        return root;
    }

    //Function to find index of a value in array.
    public int getInorderIndex(int[] inOrder, int start, int end, int data) 
    {
        for (int i = start; i <= end; i++) {
            if (inOrder[i] == data) {
                return i;
            }
        }
        return -1;
    }
    
    //Function to return a tree created from postorder and inoreder traversals.
    Node buildTree(int in[], int post[], int n) 
    {
        return buildTreeUtil(in, post, 0, n - 1, 0, n - 1);
    }
}
