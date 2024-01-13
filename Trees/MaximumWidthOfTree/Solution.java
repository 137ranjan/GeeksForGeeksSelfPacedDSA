class Solution {
    // Function to get the maximum width of a binary tree.
    int getMaxWidth(Node root) {
        if(root == null){
            return 0;
        }
    
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int maxWidth = 0;
        while(!q.isEmpty()){
            int count = q.size();
            
            if(count > maxWidth){
                    maxWidth = count;
                }   
            for(int i=0; i<count; i++){
                Node curr = q.remove();
                if(curr.left != null){
                    q.add(curr.left);
                }
                
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
        }
        
        return maxWidth;
        
    }
}
