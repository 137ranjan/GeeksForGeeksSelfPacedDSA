import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public static void main(String[] args) {
        char[][] grid = {
                { 'X', 'O', 'X' },
                { 'O', 'X', 'O' },
                { 'X', 'X', 'X' }
        };

        int result = xShape(grid);
        System.out.println(result);

    }

    // Function to find the number of 'X' total shapes.
    public static int xShape(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        boolean[][] visited = new boolean[rows][cols];
        int count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 'X' && visited[i][j] == false) {
                    bfs(grid, visited, new Point(i, j));
                    count++;
                }
            }
        }

        return count;
    }

    public static void bfs(char[][] grid, boolean[][] visited, Point source) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] dir = {
                { 0, 1 },
                { 0, -1 },
                { 1, 0 },
                { -1, 0 }
        };
        Queue<Point> q = new LinkedList<>();
        q.add(source);
        while (q.isEmpty() == false) {
            Point curr = q.poll();
            if (visited[curr.x][curr.y] == false) {
                visited[curr.x][curr.y] = true;
                for (int i = 0; i < dir.length; i++) {
                    Point next = new Point(curr.x + dir[i][0], curr.y + dir[i][1]);
                    if (next.x >= 0 && next.x < rows && next.y >= 0 && next.y < cols) {
                        if (visited[next.x][next.y] == false && grid[next.x][next.y] == 'X') {
                            q.add(new Point(next.x, next.y));
                        }
                    }
                }
            }
        }
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