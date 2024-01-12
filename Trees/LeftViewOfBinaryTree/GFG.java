class GFG
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      ArrayList<Integer> resultList = new ArrayList<>();
      if(root == null){
          return resultList;
      }
      
      Queue<Node> q = new LinkedList<>();
      q.offer(root);
      while(!q.isEmpty()){
          int count = q.size();
          for(int i=0; i<count; i++){
              Node curr = q.poll();
              if(i==0){
                  resultList.add(curr.data);
              }
              if(curr.left != null){
                  q.offer(curr.left);
              }
              if(curr.right != null){
                  q.offer(curr.right);
              }
          }
      }
      return resultList;
    }
}
