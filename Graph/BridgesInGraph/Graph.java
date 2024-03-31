import java.util.LinkedList;

class Graph {
    private int V;
    private LinkedList<Integer> adj[];
    int time = 0;
    static final int NIL = -1;

    Graph(int v) {
        V = v;
        adj = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v);
    }

    void bridgeUtil(int u, boolean[] visited, int[] disc, int[] low, int[] parent) {
        visited[u] = true;
        disc[u] = low[u] = ++time;

        for (int i : adj[u]) {
            if (!visited[i]) {
                parent[i] = u;
                bridgeUtil(i, visited, disc, low, parent);

                low[u] = Math.min(low[u], low[i]);

                if (low[i] > disc[u]) {
                    System.out.println(u + " " + i);
                }
            } else if (i != parent[u]) {
                low[u] = Math.min(low[u], disc[i]);
            }
        }
    }

    void bridge() {
        boolean[] visited = new boolean[V];
        int[] disc = new int[V];
        int[] low = new int[V];
        int[] parent = new int[V];

        for (int i = 0; i < V; i++) {
            parent[i] = NIL;
            visited[i] = false;
        }

        for (int i = 0; i < V; i++) {
            if (visited[i] == false) {
                bridgeUtil(i, visited, disc, low, parent);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Bridges in graph: ");
        Graph g = new Graph(5);
        g.addEdge(1, 0);
        g.addEdge(0, 2);
        g.addEdge(2, 1);
        g.addEdge(0, 3);
        g.addEdge(3, 4);
        g.bridge();
    }
}