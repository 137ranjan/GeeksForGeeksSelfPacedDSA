class Solution
{
    //Function to reverse the columns of a matrix.
    static void reverseCol(int matrix[][])
    {
        int r = matrix.length;
        int c = matrix[0].length;
        
        int left = 0;
        int right = c-1;
        
        while(left < right){
            for(int i=0; i<r; i++){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
            }
            
            left++;
            right--;
        }
    }
}
