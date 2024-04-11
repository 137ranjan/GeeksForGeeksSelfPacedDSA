import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int V = 5;
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<Integer>());
        }
        adj.get(0).add(3);
        adj.get(0).add(2);
        adj.get(3).add(4);
        adj.get(2).add(1);
        adj.get(1).add(0);

        // adj.get(0).add(1);
        // adj.get(2).add(1);

        System.out.println(findMotherVertex(V, adj));
    }

    // Function to find a Mother Vertex in the Graph.
    public static int findMotherVertex(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V];
        int lastVisited = 0;
        for (int i = 0; i < V; i++) {
            if (visited[i] == false) {
                dfsRec(adj, visited, i);
                lastVisited = i;
            }
        }

        Arrays.fill(visited, false);
        dfsRec(adj, visited, lastVisited);
        for (int i = 0; i < V; i++) {
            if (visited[i] == false) {
                return -1;
            }
        }

        return lastVisited;
    }

    public static void dfsRec(ArrayList<ArrayList<Integer>> adj, boolean[] visited, int source) {
        visited[source] = true;
        for (int u : adj.get(source)) {
            if (visited[u] == false) {
                dfsRec(adj, visited, u);
            }
        }
    }
}