import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[][] graph = {
                { 0, 5, 8, 0 },
                { 5, 0, 10, 15 },
                { 8, 10, 0, 20 },
                { 0, 15, 20, 0 }
        };
        System.out.println(primMST(graph));
    }

    private static int primMST(int[][] graph) {
        int V = graph.length;
        int[] key = new int[V];
        Arrays.fill(key, Integer.MAX_VALUE);
        boolean[] mSet = new boolean[V];
        key[0] = 0;
        int res = 0;

        for (int count = 0; count < V; count++) {
            int u = -1;

            for (int i = 0; i < V; i++) {
                if (!mSet[i] && (u == -1 || key[i] < key[u])) {
                    u = i;
                }
            }
            mSet[u] = true;
            res += key[u];

            for (int v = 0; v < V; v++) {
                if (graph[u][v] != 0 && mSet[v] == false) {
                    key[v] = Math.min(key[v], graph[u][v]);
                }
            }
        }

        return res;

    }
}