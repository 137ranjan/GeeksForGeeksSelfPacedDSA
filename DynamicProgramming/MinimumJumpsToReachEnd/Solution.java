public class Solution {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 0, 1, 2, 1 };
        int[] arr2 = { 4, 1, 5, 3, 1, 3, 2, 1, 8 };
        System.out.println(minJumps(arr, 5));
        // System.out.println(minJumps(arr2, 0, 0));
    }

    // my solution
    private static int minJumps1(int[] arr, int pos, int n) {

        if (pos == arr.length - 1) {
            System.out.println("f(" + pos + "," + n + ") = " + n);
            return n;
        }

        int res = Integer.MAX_VALUE;
        for (int i = 1; i <= arr[pos]; i++) {
            if (pos + i < arr.length) {
                int subRes = minJumps1(arr, pos + i, n + 1);
                res = Math.min(res, subRes);
            }
        }
        System.out.println("f(" + pos + "," + n + ") = " + res);
        return res;
    }


    // gfg solution
    private static int minJumps(int[] arr, int n) {
        if (n == 1) {
            return 0;
        }
        int res = Integer.MAX_VALUE;
        for (int i = 0; i <= n - 2; i++) {
            if (i + arr[i] >= n - 1) {
                int subRes = minJumps(arr, i + 1);
                if (subRes != Integer.MAX_VALUE) {
                    res = Math.min(res, subRes+1);
                }
            }
        }
        return res;
    }
}