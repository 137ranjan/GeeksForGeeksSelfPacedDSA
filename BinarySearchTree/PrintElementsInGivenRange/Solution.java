class Solution
{   
    //Function to return a list of BST elements in a given range.
	public static ArrayList<Integer> printNearNodes(Node root,int low,int high) {
	    ArrayList<Integer> list = new ArrayList<>();
	    inRange(root, low, high, list);
	    return list;
    }
    
    public static void inRange(Node root, int low, int high, ArrayList<Integer> list){
        if(root == null)
            return;
        if(root.data > low){
            inRange(root.left, low, high, list);
        }
        if(root.data >= low && root.data <= high){
            list.add(root.data);
        }
        if(root.data < high){
            inRange(root.right, low, high, list);
        }
        return;
    }
    
}
