class Solution{
  public:
    //Complete this function
    int RecursivePower(int n,int p)
    {
        //Your code here
        if(p == 0){
            return 1;
        }
        return n * RecursivePower(n, p-1);
    }
};
