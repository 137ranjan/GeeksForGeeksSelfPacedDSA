class Solution
{
    int[] dx = {1, -1, 0, 0};
    int[] dy = {0, 0, 1, -1};
    
    //Function to check whether the cell is within the matrix bounds.
    boolean isValid(int x, int y, int n, int m)
    {
		if (x>=0 && x<n && y>=0 && y<m)
		    return true;
		return false;
	}
	
	//Function to find distance of nearest 1 in the grid for each cell.
    public int[][] nearest(int[][] grid)
    {
        int n = grid.length;
        int m = grid[0].length;
        
        //using dp list which will store the output.
        int[][] dp = new int[n][m];
        
        for(int i=0; i<n; i++)
            for(int j=0; j<m; j++)
                dp[i][j] = 10000000;
        
        //queue to store the cell indexes which have grid value 1.
        Queue<ArrayList<Integer>> q = new LinkedList<>(); 
        
        
        //traversing all the cells of the matrix.
        for(int i = 0; i < n; i++)
        {
			for(int j = 0; j < m; j++)
			{
			    //if grid value is 1, we update the dp value at same cell as 0 
			    //and push the cell indexes into queue.
				if(grid[i][j] == 1){
					dp[i][j] = 0;
					ArrayList<Integer> temp = new ArrayList<>();
					temp.add(i);
					temp.add(j);
					q.add(temp);
				}
			}
		}
		
		while(!q.isEmpty())
		{
		    //storing the cell indexes at top of queue and popping them.
			ArrayList <Integer> curr = q.poll();
			int x = curr.get(0);
			int y = curr.get(1);
			
			//iterating over the adjacent cells.
			for(int i = 0; i < 4; i++)
			{
				int n_x = x + dx[i];
				int n_y = y + dy[i];
				
				if(isValid(n_x, n_y, n, m) && dp[n_x][n_y] > dp[x][y] + 1)
				{
				    //updating dp and pushing cell indexes in queue.
					dp[n_x][n_y] = dp[x][y] + 1;
					ArrayList<Integer> temp = new ArrayList<>();
					temp.add(n_x);
					temp.add(n_y);
					q.add(temp);
				}
			}
		}
		//returning the dp list.
		return dp;
    }
}
