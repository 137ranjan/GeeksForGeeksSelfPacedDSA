import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[][] arr = { { 5, 24 }, { 39, 60 }, { 15, 28 }, { 27, 40 }, { 50, 90 } };

        longestChainOfPairs(arr);
    }

    // This is exact similar to Activity Selection in Greedy Algorithms, that is
    // better solution
    private static void longestChainOfPairs(int[][] arr) {

        int n = arr.length;
        Pair[] pairArr = new Pair[n];
        for (int i = 0; i < n; i++) {
            Pair p = new Pair(arr[i][0], arr[i][1]);
            pairArr[i] = p;
        }
        Arrays.sort(pairArr);
        int[] lis = new int[n];
        lis[0] = 1;
        for (int i = 1; i < n; i++) {
            lis[i] = 1;
            for (int j = 0; j < i; j++) {
                if (pairArr[j].second < pairArr[i].first) {
                    lis[i] = Math.max(lis[i], lis[j] + 1);
                }
            }
        }

        int res = lis[0];
        for (int i = 1; i < n; i++) {
            res = Math.max(res, lis[i]);
        }
        System.out.println(res);
        for (int i = 0; i < res; i++) {
            System.out.print(pairArr[i] + " ");
        }
        System.out.println();
    }

    private static class Pair implements Comparable<Pair> {
        int first;
        int second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public int compareTo(Pair p) {
            if (this.first < p.first)
                return -1;
            else if (this.first > p.first)
                return 1;
            else
                return 0;
        }

        @Override
        public String toString() {
            return "(" + this.first + "," + this.second + ")";
        }
    }
}