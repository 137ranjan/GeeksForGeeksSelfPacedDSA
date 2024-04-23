public class Solution {
    public static void main(String[] args) {
        int N = 8;
        System.out.println(solve(N));
    }

    public static boolean solve(int N) {
        int[][] board = new int[N][N];
        if (solveRec(0, board) == false) {
            return false;
        } else {
            printMatrix(board);
            return true;
        }
    }

    private static boolean solveRec(int col, int[][] board) {
        int N = board.length;
        if (col == N) {
            return true;
        }
        for (int i = 0; i < N; i++) {
            if (isSafe(i, col, board)) {
                board[i][col] = 1;
                if (solveRec(col + 1, board) == true) {
                    return true;
                }
                board[i][col] = 0;
            }
        }
        return false;
    }

    private static boolean isSafe(int row, int col, int[][] board) {
        int N = board.length;
        for (int i = 0; i < col; i++) {
            if (board[row][i] == 1) {
                return false;
            }
        }
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        for (int i = row, j = col; i < N && j >= 0; i++, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    private static void printMatrix(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
}