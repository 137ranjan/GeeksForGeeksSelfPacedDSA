import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

class Graph {
    private int V;
    private LinkedList<Integer>[] adj;

    Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    void DFSUtil(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " ");

        int n;

        Iterator<Integer> i = adj[v].iterator();
        while (i.hasNext()) {
            n = i.next();
            if (!visited[n]) {
                DFSUtil(n, visited);
            }
        }

    }

    Graph getTranspose() {
        Graph g = new Graph(V);
        for (int v = 0; v < V; v++) {
            Iterator<Integer> i = adj[v].iterator();
            while (i.hasNext()) {
                g.adj[i.next()].add(v);
            }
        }
        return g;
    }

    void fillOrder(int v, boolean visited[], Stack<Integer> stack) {
        visited[v] = true;
        for (int i : adj[v]) {
            if (visited[i] == false) {
                fillOrder(i, visited, stack);
            }
        }
        stack.push(v);
    }

    void printSCCs() {
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (visited[i] == false) {
                fillOrder(i, visited, stack);
            }
        }
        Graph gr = getTranspose();

        Arrays.fill(visited, false);

        while (stack.empty() == false) {
            int v = (int) stack.pop();

            if (visited[v] == false) {
                gr.DFSUtil(v, visited);
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdge(1, 0);
        g.addEdge(0, 2);
        g.addEdge(2, 1);
        g.addEdge(0, 3);
        g.addEdge(3, 4);

        System.out.println("Following are strongly connected components " +
                "in given graph ");
        g.printSCCs();
    }

}