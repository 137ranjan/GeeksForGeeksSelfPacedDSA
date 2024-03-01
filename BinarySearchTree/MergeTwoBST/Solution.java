//User function Template for Java


/*
class Node  
{ 
    int data; 
    Node left, right; 
   
    public Node(int d)  
    { 
        data = d; 
        left = right = null; 
    } 
}
    
*/
class Solution
{
    //Function to return a list of integers denoting the node 
    //values of both the BST in a sorted order.
    public List<Integer> merge(Node root1,Node root2)
    {
        // Write your code here
        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();
        List<Integer> result = new ArrayList<>();
        
        if(root1 == null){
            inorder(root2, result);
            return result;
        }
        
        if(root2 == null){
            inorder(root1, result);
            return result;
        }
        
        while(root1 != null || !s1.isEmpty() || root2 != null || !s2.isEmpty()){
            if(root1 != null || root2 != null){
                if(root1 != null){
                    s1.push(root1);
                    root1 = root1.left;
                }
                if(root2!= null){
                    s2.push(root2);
                    root2 = root2.left;
                }
            }
            else{
                if(s1.isEmpty()){
                    while(!s2.isEmpty()){
                        root2 = s2.peek();
                        s2.pop();
                        root2.left = null;
                        inorder(root2, result);
                    }
                    return result;
                }
                if(s2.isEmpty()){
                    while(!s1.isEmpty()){
                        root1 = s1.peek();
                        s1.pop();
                        root1.left = null;
                        inorder(root1, result);
                    }
                    return result;
                }
                
                root1 = s1.peek();
                root2 = s2.peek();
                s1.pop();
                s2.pop();
                
                if(root1.data < root2.data){
                    result.add(root1.data);
                    root1 = root1.right;
                    s2.push(root2);
                    root2 = null;
                }
                else{
                    result.add(root2.data);
                    root2 = root2.right;
                    s1.push(root1);
                    root1 = null;
                }
            }
        }
        
        return result;
    }
    
    private void inorder(Node root, List<Integer> result){
        if(root == null) return;
        inorder(root.left, result);
        result.add(root.data);
        inorder(root.right, result);
    }
    
    private Node minimumValueNode(Node root){
        while(root != null){
            root = root.left;
        }
        return root;
    }
    
}
