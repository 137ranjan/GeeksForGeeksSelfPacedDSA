class Solution 
{
    //Function to find the minimum number of Hops required for the rat to 
    //reach from the source block to the destination block.
    public static void solve(int[][] maze, int N)
    {
        int[][] sol = new int[N][N];
        if(solveRec(maze, N, 0, 0, sol) == true){
            GFG.print(N, sol);
        }else{
            System.out.println(-1);
        }
        
    }
    
    private static boolean solveRec(int[][]maze, int N, int i, int j, int[][]sol){
        if(i == N-1 && j == N-1){
            sol[i][j] = 1;
            return true;
        }
        if(isSafe(maze, N, i, j)==true){
            sol[i][j] = 1;
            int jump = maze[i][j];
            for(int k=1; k<=jump; k++){
                if(solveRec(maze, N, i, j+k, sol)==true){
                    return true;
                }
                if(solveRec(maze, N, i+k, j, sol)==true){
                    return true;
                }
                
            }
            sol[i][j] = 0;
        }
        
        return false;
    }
    
    private static boolean isSafe(int[][]maze, int N, int i, int j){
        // System.out.println("i="+i+"j="+j+"isSafe="+(i<N && j<N && maze[i][j] != 0));
        return (i<N && j<N && maze[i][j] != 0);
    }
    
}
