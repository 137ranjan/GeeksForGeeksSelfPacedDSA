import java.util.PriorityQueue;

public class Solution{
    public static void main(String[] args){
        int[] arr = {30, 40, 32, 33, 36, 37};
        int x = 38;
        int k = 3;
        kClosestElements(arr, x, k);
    }

    public static class Pair{
        int diff;
        int index;
        public Pair(int diff, int index){
            this.diff = diff;
            this.index = index;
        }
    }
    public static void kClosestElements(int[] arr, int x, int k){
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> b.diff - a.diff);
        for(int i = 0; i < k; i++){
            pq.add(new Pair(Math.abs(arr[i]-x),i));
        }
        for(int i=k; i<arr.length; i++){
            if(Math.abs(arr[i]-x) < pq.peek().diff){
                pq.remove();
                pq.add(new Pair(Math.abs(arr[i]-x),i));
            }
        }
        while(!pq.isEmpty()){
            System.out.println(arr[pq.remove().index]);
        }

    }
}