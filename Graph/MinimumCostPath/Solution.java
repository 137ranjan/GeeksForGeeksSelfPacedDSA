import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
    public static void main(String[] args) {
        int[][] grid = {
                { 9, 4, 9, 9 },
                { 6, 7, 6, 4 },
                { 8, 3, 3, 7 },
                { 7, 4, 9, 10 }
        };

        System.out.println(minimumCostPath(grid));
    }

    static int[] dx = { -1, 0, 1, 0 };
    static int[] dy = { 0, 1, 0, -1 };

    static class Cell {
        int x;
        int y;
        int distance;

        Cell(int x, int y, int distance) {
            this.x = x;
            this.y = y;
            this.distance = distance;
        }
    }

    static class DistanceComparator implements Comparator<Cell> {
        public int compare(Cell a, Cell b) {
            if (a.distance < b.distance) {
                return -1;
            } else if (a.distance > b.distance) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    static boolean isInsideGrid(int i, int j, int rows, int cols) {
        return (i >= 0 && i < rows && j >= 0 && j < cols);
    }

    public static int minimumCostPath(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        int[][] dp = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }
        dp[0][0] = grid[0][0];

        PriorityQueue<Cell> pq = new PriorityQueue<>(row * col, new DistanceComparator());
        pq.add(new Cell(0, 0, dp[0][0]));
        while (pq.isEmpty() == false) {
            Cell curr = pq.poll();

            for (int i = 0; i < 4; i++) {
                int rows = curr.x + dx[i];
                int cols = curr.y + dy[i];

                if (isInsideGrid(rows, cols, grid.length, grid[0].length)) {
                    if (dp[rows][cols] > dp[curr.x][curr.y] + grid[rows][cols]) {
                        if (dp[rows][cols] != Integer.MAX_VALUE) {
                            Cell adj = new Cell(rows, cols, dp[rows][cols]);
                            pq.remove(adj);
                        }
                        dp[rows][cols] = dp[curr.x][curr.y] + grid[rows][cols];
                        pq.add(new Cell(rows, cols, dp[rows][cols]));
                    }
                }
            }
        }
        return dp[row - 1][col - 1];
    }
}