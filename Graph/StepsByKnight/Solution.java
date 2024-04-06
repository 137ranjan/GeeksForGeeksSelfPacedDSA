import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public static void main(String[] args) {
        int[] KnightPos = { 4, 5 };
        int[] TargetPos = { 1, 1 };
        int N = 6;
        System.out.println(minStepToReachTarget(KnightPos, TargetPos, N));
    }

    public static int minStepToReachTarget(int KnightPos[], int TargetPos[], int N) {
        if (KnightPos[0] == TargetPos[0] && KnightPos[1] == TargetPos[1]) {
            return 0;
        }
        int rows = N;
        int cols = N;
        boolean[][] visited = new boolean[rows][cols];
        int[][] directions = {
                { -2, 1 }, { -2, -1 },
                { 2, 1 }, { 2, -1 },
                { -1, 2 }, { -1, -2 },
                { 1, 2 }, { 1, -2 }
        };
        Queue<Point> q = new LinkedList<>();
        q.add(new Point(KnightPos[0], KnightPos[1], 0));
        visited[KnightPos[0] - 1][KnightPos[1] - 1] = true;
        while (q.isEmpty() == false) {
            Point curr = q.poll();
            for (int i = 0; i < directions.length; i++) {
                Point newPoint = new Point(curr.x + directions[i][0], curr.y + directions[i][1], curr.t + 1);

                if (newPoint.x > 0 && newPoint.x <= rows && newPoint.y > 0 && newPoint.y <= cols) {
                    if (visited[newPoint.x - 1][newPoint.y - 1] == true) {
                        continue;
                    }
                    if (newPoint.x == TargetPos[0] && newPoint.y == TargetPos[1]) {
                        return newPoint.t;
                    } else {
                        q.add(newPoint);
                        visited[newPoint.x - 1][newPoint.y - 1] = true;
                    }
                }

            }
        }
        return -1;
    }

    public static class Point {
        int x;
        int y;
        int t;

        Point(int x, int y, int t) {
            this.x = x;
            this.y = y;
            this.t = t;
        }
    }
}