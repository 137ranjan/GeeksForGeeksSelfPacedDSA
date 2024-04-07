import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public static void main(String[] args) {
        char[][] grid = {
                { '0', '1' },
                { '1', '0' },
                { '1', '1' },
                { '1', '0' }
        };
        char[][] grid2 = {
                { '0', '1', '1', '1', '0', '0', '0' },
                { '0', '0', '1', '1', '0', '1', '0' }
        };

        System.out.println(numIslands(grid));
        System.out.println(numIslands(grid2));
    }

    public static int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        boolean[][] visited = new boolean[rows][cols];
        int count = 0;
        Queue<Pair> q = new LinkedList<>();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1' && visited[i][j] == false) {
                    count++;
                    q.add(new Pair(i, j));
                    visited[i][j] = true;
                    bfs(grid, visited, rows, cols, q);
                }
            }
        }
        return count;
    }

    public static void bfs(char[][] grid, boolean[][] visited, int rows, int cols, Queue<Pair> q) {

        int[][] directions = {
                { 0, 1 }, { 0, -1 },
                { 1, 0 }, { -1, 0 },
                { 1, 1 }, { -1, -1 },
                { -1, 1 }, { 1, -1 }
        };
        while (q.isEmpty() == false) {
            Pair curr = q.poll();
            for (int i = 0; i < directions.length; i++) {
                Pair newPair = new Pair(curr.x + directions[i][0], curr.y + directions[i][1]);
                if (newPair.x >= 0 && newPair.x < rows && newPair.y >= 0 && newPair.y < cols) {
                    if (grid[newPair.x][newPair.y] == '1' && visited[newPair.x][newPair.y] == false) {
                        q.add(newPair);
                        visited[newPair.x][newPair.y] = true;
                    }
                }
            }

        }
    }

    public static class Pair {
        int x;
        int y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void printMatrix(boolean[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}