import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public static void main(String[] args) {
        int[][] grid = {
                { 1, 1, 1, 0 },
                { 0, 0, 1, 0 },
                { 0, 0, 0, 1 }
        };

        int[][] grid2 = { { 0, 1 } };

        System.out.println(maxArea(grid));
    }

    private static class Pair {
        int x;
        int y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

    }

    public static int bfs(int[][] grid, Queue<Pair> q, boolean[][] visited) {
        int area = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        int[][] dir = {
                { 0, -1 }, { 0, 1 },
                { 1, 0 }, { -1, 0 },
                { 1, 1 }, { 1, -1 },
                { -1, -1 }, { -1, 1 }
        };
        while (!q.isEmpty()) {
            Pair curr = q.remove();
            for (int i = 0; i < dir.length; i++) {
                Pair next = new Pair(curr.x + dir[i][0], curr.y + dir[i][1]);
                if (next.x >= 0 && next.x < rows && next.y >= 0 && next.y < cols) {
                    if (visited[next.x][next.y] == false && grid[next.x][next.y] == 1) {
                        q.add(next);
                        area++;
                        visited[next.x][next.y] = true;
                    }
                }
            }
        }

        return area;
    }

    public static int maxArea(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        boolean[][] visited = new boolean[rows][cols];
        int maxArea = 0;
        Queue<Pair> q = new LinkedList<>();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1 && visited[i][j] == false) {
                    q.add(new Pair(i, j));
                    visited[i][j] = true;
                    int area = bfs(grid, q, visited);
                    maxArea = Math.max(maxArea, area + 1);
                }
            }
        }

        return maxArea;
    }
}