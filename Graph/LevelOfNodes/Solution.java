import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int V = 6;
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<Integer>());
        }
        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(0);
        adj.get(1).add(3);
        adj.get(1).add(4);
        adj.get(2).add(0);
        adj.get(2).add(5);

        System.out.println(nodeLevel(V, adj, 4));

    }

    public static int nodeLevel(int V, ArrayList<ArrayList<Integer>> adj, int X) {
        Queue<Node> q = new LinkedList<>();
        boolean[] visited = new boolean[V];
        q.add(new Node(0, 0));
        visited[0] = true;
        while (!q.isEmpty()) {
            Node u = q.remove();
            if (u.x == X) {
                return u.level;
            }
            for (int x : adj.get(u.x)) {
                if (visited[x] == false) {
                    visited[x] = true;
                    q.add(new Node(x, u.level + 1));
                }
            }
        }
        return -1;
    }

    public static class Node {
        int x;
        int level;

        Node(int x, int level) {
            this.x = x;
            this.level = level;
        }
    }
}