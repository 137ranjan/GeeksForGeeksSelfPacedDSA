public class Solution {
    public static void main(String[] args) {
        int[] petrol = { 4, 8, 7, 4 };
        int[] dist = { 6, 5, 3, 5 };
        int n = petrol.length;

        int result = firstPetrolPump(petrol, dist, n);
        System.out.println(result);
    }

    private static int firstPetrolPump(int[] petrol, int[] dist, int n) {
        for (int start = 0; start < n; start++) {
            int curr_petrol = 0;
            int end = start;
            while (true) {
                curr_petrol += (petrol[end] - dist[end]);
                if (curr_petrol < 0)
                    break;
                end = (end + 1) % n;
                if (end == start) {
                    return (start + 1);
                }
            }
        }
        return -1;
    }
}