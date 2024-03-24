import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int graph[][] = {
                { 0, 50, 100, 0 },
                { 50, 0, 30, 200 },
                { 100, 30, 0, 20 },
                { 0, 200, 20, 0 }
        };
        
        for (int x : djikstra(graph, 0)) {
            System.out.print(x + " ");
        }
    }

    private static int[] djikstra(int[][] graph, int src) {
        int V = graph.length;
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;
        boolean[] fin = new boolean[V];

        for (int count = 0; count < V - 1; count++) {
            int u = -1;
            for (int i = 0; i < V; i++) {
                if (!fin[i] && (u == -1 || dist[i] < dist[u])) {
                    u = i;
                }
            }
            fin[u] = true;

            for (int v = 0; v < V; v++) {
                if (graph[u][v] != 0 && fin[v] == false) {
                    dist[v] = Math.min(dist[v], dist[u] + graph[u][v]);
                }
            }
        }
        return dist;

    };
}
