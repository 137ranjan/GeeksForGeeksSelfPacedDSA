class Solution
{
    //Function for finding determinant of matrix.
    static int determinantOfMatrix(int matrix[][], int n)
    {
        int D = 0; 

        //base case
        if (n == 1)
            return matrix[0][0];

        //creating a list to store Cofactors.
        int temp[][]  = new int[n][n];

        int sign = 1;

        //iterating for each element of first row.
        for (int i = 0; i < n; i++)
        {
            //getting Cofactor of matrix[0][i].
            getCofactor(matrix, temp, 0, i, n);
            D += sign * matrix[0][i] * determinantOfMatrix(temp, n - 1);

            //terms are to be added with alternate sign so changing the sign.
            sign = -sign;
        }
        //returning the determinant.
        return D; 
    }
    
    //Function to get cofactor of matrix[p][q] in temp[][]. 
    static void getCofactor(int matrix[][], int temp[][], int p, int q, int n)
    {
        int i = 0, j = 0;

        for (int row = 0; row < n; row++)
        {
            for (int col = 0; col < n; col++)
            {
                //copying only those elements into temporary matrix 
                //which are not in given row and column.
                if(row != p && col != q)
                {
                    temp[i][j++] = matrix[row][col];

                    //if row is filled, we increase row index and
                    //reset column index.
                    if(j == n - 1)
                    {
                        j = 0;
                        i++;
                    }
                }
            }
         }
    }
}
