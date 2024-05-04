import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[][] arr = { { 6, 2 }, { 4, 3 }, { 2, 6 }, { 1, 5 }, { 1, 3 } };
        buildBridges(arr);
    }

    // build bridges, no criss cross between two bridges
    private static void buildBridges(int[][] arr) {
        Pair[] pairs = new Pair[arr.length];
        for (int i = 0; i < arr.length; i++) {
            Pair p = new Pair(arr[i][0], arr[i][1]);
            pairs[i] = p;
        }

        Arrays.sort(pairs);

        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = pairs[i].y;
        }

        int lisLength = lis(arr2);

        for (int i = 0; i < lisLength; i++) {
            System.out.print(pairs[i] + " ");
        }
        System.out.println();

    }

    private static int lis(int[] arr) {
        int n = arr.length;
        int[] tail = new int[n];
        int len = 1;
        tail[0] = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > tail[len - 1]) {
                tail[len] = arr[i];
                len++;
            } else {
                int c = ceilIndex(tail, 0, len, arr[i]);
                tail[c] = arr[i];
            }
        }

        return len;
    }

    private static int ceilIndex(int[] tail, int l, int r, int x) {
        while (l < r) {
            int m = l + (r - l) / 2;
            if (tail[m] >= x) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        return r;
    }

    private static class Pair implements Comparable<Pair> {
        int x;
        int y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Pair p) {
            if (this.x < p.x) {
                return -1;
            } else if (this.x > p.x) {
                return 1;
            } else {
                if (this.x == p.x) {
                    if (this.y < p.y) {
                        return -1;
                    } else if (this.y > p.y) {
                        return 1;
                    } else {
                        return 0;
                    }
                }
            }
            return 0;
        }

        @Override
        public String toString() {
            return "(" + this.x + "," + this.y + ")";
        }
    }
}