import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public static void main(String[] args) {
        int[][] grid = {
                { 3, 0, 3, 0, 0 },
                { 3, 0, 0, 0, 3 },
                { 3, 3, 3, 3, 3 },
                { 0, 2, 3, 0, 0 },
                { 3, 0, 0, 1, 3 }
        };
        int[][] grid2 = {
                { 1, 3 },
                { 3, 2 }
        };
        System.out.println(is_Possible(grid));
        System.out.println(is_Possible(grid2));
    }

    public static boolean is_Possible(int[][] grid) {
        Queue<Point> q = new LinkedList<>();
        int rows = grid.length;
        int cols = grid[0].length;
        boolean[][] visited = new boolean[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    q.add(new Point(i, j));
                    visited[i][j] = true;
                    i = rows;
                    break;
                }
            }
        }
        int[][] direction = {
                { 1, 0 },
                { -1, 0 },
                { 0, -1 },
                { 0, 1 }
        };
        while (!q.isEmpty()) {
            Point curr = q.remove();
            for (int i = 0; i < direction.length; i++) {
                Point next = new Point(curr.x + direction[i][0], curr.y + direction[i][1]);
                if (next.x >= 0 && next.x < rows && next.y >= 0 && next.y < cols) {
                    if (grid[next.x][next.y] == 2) {
                        return true;
                    } else if (grid[next.x][next.y] == 3 && visited[next.x][next.y] == false) {
                        q.add(new Point(next.x, next.y));
                        visited[next.x][next.y] = true;
                    }
                }
            }
        }
        return false;
    }

    public static class Point {
        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

}