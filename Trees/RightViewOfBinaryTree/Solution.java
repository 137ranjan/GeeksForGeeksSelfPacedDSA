class Solution{
    //Function to return list containing elements of right view of binary tree.
    ArrayList<Integer> rightView(Node node) {
         ArrayList<Integer> resultList = new ArrayList<>();
      if(node == null){
          return resultList;
      }
      
      Queue<Node> q = new LinkedList<>();
      q.offer(node);
      while(!q.isEmpty()){
          int count = q.size();
          for(int i=0; i<count; i++){
              Node curr = q.poll();
              if(i==(count-1)){
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
