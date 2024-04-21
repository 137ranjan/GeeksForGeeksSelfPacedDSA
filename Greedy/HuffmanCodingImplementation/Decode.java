class Decode
{
    //Function to return the decoded string.
    static String decodeHuffmanData(MinHeapNode root, String binaryString)
    {
        
        String ans = "";
        MinHeapNode curr = root;
        
        //iterating over the string.
        for (int i=0; i<binaryString.length(); i++)
        {
            //if character is "0" then moving to left child of parent node
            //else to the right child.
            if (binaryString.charAt(i) == '0')
            curr = curr.left;
            else
            curr = curr.right;
            
            //if both the child of current node are null, we add the data 
            //at current node in our result and update current node.
            if (curr.left == null && curr.right == null)
            {
                ans += curr.data;
                curr = root;
            }
        }
        //returning the resultant string.
        return ans+'\0';
    }
}
