import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Solution {
    public static void main(String[] args) {

        List<List<Integer>> arr = new ArrayList<>();
        arr.add(Arrays.asList(5, 10));
        arr.add(Arrays.asList(4, 9));
        arr.add(Arrays.asList(6));

        System.out.println(mergeKSortedArr(arr));
    }

    private static class Triplet implements Comparable<Triplet> {
        int val;
        int aPos;
        int vPos;

        Triplet(int val, int aPos, int vPos) {
            this.val = val;
            this.aPos = aPos;
            this.vPos = vPos;
        }

        public int compareTo(Triplet t) {
            if (this.val <= t.val)
                return -1;
            else
                return 1;
        }
    }

    private static List<Integer> mergeKSortedArr(List<List<Integer>> arr) {
        List<Integer> res = new ArrayList<>();
        PriorityQueue<Triplet> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.size(); i++) {
            pq.add(new Triplet(arr.get(i).get(0), i, 0));
        }
        while (pq.isEmpty() == false) {
            Triplet curr = pq.poll();
            res.add(curr.val);
            int aPos = curr.aPos;
            int vPos = curr.vPos;
            if (vPos + 1 < arr.get(aPos).size()) {
                pq.add(new Triplet(arr.get(aPos).get(vPos + 1), aPos, vPos + 1));
            }
        }
        return res;
    }
}