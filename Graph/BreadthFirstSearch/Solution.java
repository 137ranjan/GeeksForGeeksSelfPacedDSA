import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adjacencyList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            adjacencyList.add(i, new ArrayList<>());
        }

        addEdge(adjacencyList, 0, 1);
        addEdge(adjacencyList, 0, 2);
        addEdge(adjacencyList, 1, 2);
        addEdge(adjacencyList, 1, 3);
        addEdge(adjacencyList, 2, 3);
        addEdge(adjacencyList, 2, 4);
        addEdge(adjacencyList, 3, 4);

        printGraph(adjacencyList);

        bfs(adjacencyList, 5, 0);

    }

    private static void addEdge(ArrayList<ArrayList<Integer>> adjacencyList, int u, int v) {
        adjacencyList.get(u).add(v);
        adjacencyList.get(v).add(v);
    }

    private static void printGraph(ArrayList<ArrayList<Integer>> adjacencyList) {
        for (int i = 0; i < adjacencyList.size(); i++) {
            System.out.print(i + " -> ");
            for (int x : adjacencyList.get(i)) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }

    private static void bfs(ArrayList<ArrayList<Integer>> adjacencyList, int v, int s) {
        boolean visited[] = new boolean[v + 1];
        Queue<Integer> q = new LinkedList<>();
        visited[s] = true;
        q.add(s);
        while (!q.isEmpty()) {
            int u = q.poll();
            System.out.print(u + " ");
            for (int x : adjacencyList.get(u)) {
                if (visited[x] == false) {
                    visited[x] = true;
                    q.add(x);
                }
            }
        }
    }

}