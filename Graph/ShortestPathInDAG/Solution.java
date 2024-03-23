import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        Graph g = new Graph(6);
        g.addEdge(0, 1, 2);
        g.addEdge(0, 4, 1);
        g.addEdge(1, 2, 3);
        g.addEdge(4, 2, 2);
        g.addEdge(4, 5, 4);
        g.addEdge(2, 3, 6);
        g.addEdge(5, 3, 1);

        int s = 0;
        System.out.println("Following are shortest distances " +
                "from source " + s);
        System.out.println(Arrays.toString(g.shortestPathInDAG(s)));
    }

    public static class AdjListNode {
        int v;
        int weight;

        AdjListNode(int v, int weight) {
            this.v = v;
            this.weight = weight;
        }
    }

    public static class Graph {
        int V;
        private LinkedList<AdjListNode>[] adj;

        Graph(int V) {
            this.V = V;
            adj = (LinkedList<AdjListNode>[]) new LinkedList[V];
            for (int i = 0; i < V; i++) {
                adj[i] = new LinkedList<AdjListNode>();
            }
        }

        public void addEdge(int u, int v, int weight) {
            AdjListNode node = new AdjListNode(v, weight);
            this.adj[u].add(node);
        }

        public void topologicalSort(int u, boolean[] visited, Stack<Integer> stack) {
            visited[u] = true;
            for (AdjListNode vNode : this.adj[u]) {
                if (visited[vNode.v] == false) {
                    topologicalSort(vNode.v, visited, stack);
                }
            }
            stack.push(u);
        }

        public int[] shortestPathInDAG(int s) {
            Stack<Integer> stack = new Stack<>();
            int[] dist = new int[this.V];

            boolean[] visited = new boolean[this.V];
            for (int i = 0; i < this.V; i++) {
                if (visited[i] == false) {
                    topologicalSort(i, visited, stack);
                }
            }
            Arrays.fill(dist, Integer.MAX_VALUE);
            dist[s] = 0;
            while (stack.isEmpty() == false) {
                int u = stack.pop();
                for (AdjListNode vNode : this.adj[u]) {
                    if (dist[vNode.v] > dist[u] + vNode.weight) {
                        dist[vNode.v] = dist[u] + vNode.weight;
                    }
                }
            }

            return dist;
        }
    }
}
