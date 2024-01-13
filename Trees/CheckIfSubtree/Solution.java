class Solution {
    public static boolean isSubtree(Node T, Node S) {
        if(S == null){
            return true;
        }
        if(T == null){
            return false;
        }
        return isSameTree(T, S) || isSubtree(T.left, S) || isSubtree(T.right, S);
    }
    
    private static boolean isSameTree(Node T, Node S){
        if(T == null && S == null){
            return true;
        }
        if(T == null || S == null){
            return false;
        }
        return (T.data == S.data) && isSameTree(T.left, S.left) && isSameTree(T.right, S.right);
    }
}
