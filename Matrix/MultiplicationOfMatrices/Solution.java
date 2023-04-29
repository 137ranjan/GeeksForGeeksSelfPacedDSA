class Solution
{
    //Function to multiply two matrices.
    static int[][] multiplyMatrix(int A[][], int B[][])
    {
        int r1 = A.length;
        int c1 = A[0].length;
        
        int r2 = B.length;
        int c2 = B[0].length;
        
        if(c1 != r2){
            return new int[0][0];
        }
        
        int[][] result = new int[r1][c2];
        
        for(int i=0; i<r1; i++){
            for(int j=0; j<c2; j++){
                int temp = 0;
                for(int k=0; k<c1; k++){
                    temp += A[i][k] * B[k][j];
                }
                result[i][j] = temp;
            }
        } 
        return result;
    }
}
