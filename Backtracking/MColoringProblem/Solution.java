class solve {
    // Function to determine if graph can be coloured with at most M colours
    // such
    // that no two adjacent vertices of graph are coloured with same colour.
    public boolean graphColoring(boolean graph[][], int m, int n) {
        // Your code here
        int[] color = new int[n];
        if(solve(0, graph, color, n, m) == true){
            return true;
        }
        return false;
        
    }
    
    private boolean solve(int node, boolean graph[][], int[] color, int n, int m){
        if(node == n){
            return true;
        }
        for(int i=1; i<=m; i++){
            if(isSafe(node, graph, color, n, i)){
                color[node] = i;
                if(solve(node+1, graph, color, n, m)==true){
                    return true;
                }
                color[node] = 0;
            }
        }
        return false;
    }
    
    private boolean isSafe(int node, boolean[][]graph, int[] color, int n, int col){
        for(int i=0; i<n; i++){
            if(graph[node][i]==true){
                if(color[i] == col){
                    return false;
                }
            }
        }
        return true;
    }
}
