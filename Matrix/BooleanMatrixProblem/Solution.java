class Solution
{
    //Function to modify the matrix such that if a matrix cell matrix[i][j]
    //is 1 then all the cells in its ith row and jth column will become 1.
    void booleanMatrix(int matrix[][])
    {
        int r = matrix.length;
        int c = matrix[0].length;
        
        int[] rowArr = new int[r];
        int[] colArr = new int[c];
        
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(matrix[i][j] == 1){
                    rowArr[i]++;
                    colArr[j]++;
                }
            }
        }
        
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(colArr[j] > 0 || rowArr[i] > 0){
                    matrix[i][j] = 1;
                }
            }
        }
        
        
    }
}
