class Solution
{
    //Function to add two matrices.
    static int[][] sumMatrix(int A[][], int B[][])
    {
       int r1 = A.length;
       int c1 = A[0].length;
       
       int r2 = B.length;
       int c2 = B[0].length;
       
       
       int[][] result = new int[r1][c1];
       
       if(r1 != r2 || c1 != c2){
           return new int[0][0];
       }
       
       for(int i=0; i<r1; i++){
           for(int j=0; j<c1; j++){
               result[i][j] = A[i][j] + B[i][j];
           }
       }
       
       return result;
    }
}
