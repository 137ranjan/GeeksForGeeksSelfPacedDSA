// Articulation points in Disconnected graph
class Solution {
    TreeSet<Integer> al = new TreeSet<>(); // TreeSet to store the articulation points
    int time = 0; // variable to keep track of discovery time

    public int[] articulationPoints(int v, ArrayList<ArrayList<Integer>> adj) {
        int disc[] = new int[v]; // array to store the discovery time of each vertex
        int low[] = new int[v]; // array to store the low points of each vertex
        boolean visited[] = new boolean[v]; // boolean array to keep track of visited vertices

        for (int i = 0; i < v; i++) {
            if (!visited[i]) // if vertex is not visited, call the utility function
                util(i, -1, adj, disc, low, visited);
        }

        if (al.size() == 0) { // if no articulation points found
            int ans[] = {-1}; // return -1 as answer
            return ans;
        }

        int ans[] = new int[al.size()]; // array to store the articulation points
        int i = 0;
        for (int x : al)
            ans[i++] = x; // copy values from TreeSet to array

        return ans;
    }

    void util(int v, int parent, ArrayList<ArrayList<Integer>> adj, int disc[], int low[], boolean visited[]) {
        disc[v] = time; // set the discovery time of current vertex
        low[v] = time++; // set the low point of current vertex
        visited[v] = true; // mark current vertex as visited
        int count = 0; // variable to count the number of child vertices

        for (int x : adj.get(v)) { // iterate over the neighbors of current vertex
            if (!visited[x]) { // if neighbor is not visited, call the utility function
                util(x, v, adj, disc, low, visited);

                count++; // increment the child count
                low[v] = Math.min(low[v], low[x]); // update the low point of current vertex

                if (parent != -1 && low[x] >= disc[v]) // if current vertex is not root and low point of neighbor is greater than or equal to discovery time of current vertex
                    al.add(v); // add current vertex to the TreeSet
            } else if (x != parent) { // if neighbor is visited and not parent of current vertex
                low[v] = Math.min(low[v], disc[x]); // update the low point of current vertex
            }
        }

        if (parent == -1 && count >= 2) // if current vertex is root and has two or more children
            al.add(v); // add current vertex to the TreeSet
    }
}
