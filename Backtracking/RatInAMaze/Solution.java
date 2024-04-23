public class Solution {
    public static void main(String[] args) {
        int[][] maze = {
                { 1, 0, 1 },
                { 1, 1, 0 },
                { 0, 1, 1 }
        };
        int rows = maze.length;
        int cols = maze[0].length;
        int[][] sol = new int[rows][cols];
        System.out.println(solveMaze(maze, sol, rows, cols));
    }

    private static boolean solveMaze(int[][] maze, int[][] sol, int rows, int cols) {
        if (solveMazeRec(0, 0, maze, sol, rows, cols) == false) {
            return false;
        } else {
            printMatrix(sol);
            return true;
        }
    }

    private static boolean solveMazeRec(int i, int j, int[][] maze, int[][] sol, int rows, int cols) {
        if (i == rows - 1 && j == cols - 1) {
            sol[i][j] = 1;
            return true;
        }
        if (isSafe(i, j, maze, rows, cols) == true) {
            sol[i][j] = 1;
            if (solveMazeRec(i + 1, j, maze, sol, rows, cols) == true)
                return true;
            else if (solveMazeRec(i, j + 1, maze, sol, rows, cols) == true)
                return true;
            sol[i][j] = 0;
        }
        return false;
    }

    private static boolean isSafe(int i, int j, int[][] maze, int rows, int cols) {
        return (i < rows && j < cols && maze[i][j] == 1);
    }

    private static void printMatrix(int[][] sol) {
        for (int i = 0; i < sol.length; i++) {
            for (int j = 0; j < sol[0].length; j++) {
                System.out.print(sol[i][j] + " ");
            }
            System.out.println();
        }
    }
}