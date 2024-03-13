import java.util.PriorityQueue;

public class Solution {
    public static void main(String[] args) {
        int[] cost = { 1, 12, 5, 111, 200 };
        int sum = 10;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < cost.length; i++) {
            pq.add(cost[i]);
        }
        int res = 0;
        for (int i = 0; i < cost.length; i++) {
            if (sum >= pq.peek()) {
                sum = sum - pq.poll();
                res = res + 1;
            }
        }
        System.out.println("res = " + res);
    }
}