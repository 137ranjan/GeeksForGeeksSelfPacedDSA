import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int V = 5;
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<Integer>());
        }
        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(0).add(4);
        adj.get(1).add(3);
        adj.get(1).add(4);
        adj.get(2).add(4);
        adj.get(3).add(2);

        int s = 0;
        int d = 4;
        int result = countPaths(V, adj, s, d);
        System.out.println(result);
    }

    public static int countPaths(int V, ArrayList<ArrayList<Integer>> adj, int source,
            int destination) {
        boolean[] visited = new boolean[V];
        dfs(adj, source, visited, destination);
        return count;
    }

    private static int count = 0;

    private static void dfs(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited, int d) {
        visited[s] = true;
        if (s == d) {
            count++;
        }
        for (int u : adj.get(s)) {
            if (visited[u] == false) {
                dfs(adj, u, visited, d);
                visited[u] = false;
            }
        }
        visited[s] = false;
    }
}