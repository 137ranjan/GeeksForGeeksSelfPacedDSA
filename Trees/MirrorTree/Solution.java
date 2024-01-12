class Solution {
    // Function to convert a binary tree into its mirror tree.
    void mirror(Node node) {
        if(node == null){
            return;
        }
        Node left = node.left;
        Node right = node.right;
        
        node.left = right;
        node.right = left;
        
        mirror(node.left);
        mirror(node.right);
    }
    
}
