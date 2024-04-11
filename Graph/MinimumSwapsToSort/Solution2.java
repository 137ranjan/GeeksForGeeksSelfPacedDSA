import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Solution2 {
    public static void main(String[] args) {
        int[] nums = { 10, 19, 6, 3, 5 };
        System.out.println(minSwaps(nums));
    }

    public static int minSwaps(int nums[]) {
        int n = nums.length;

        // creating a list of pairs where first element of pair is array
        // element and second element is its position.
        ArrayList<ArrayList<Integer>> cur = new ArrayList<>();

        // iterating over the array elements.
        for (int i = 0; i < n; i++) {
            // storing the elements and their position as pair in the list.
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(nums[i]);
            temp.add(i);
            cur.add(temp);
        }

        // sorting the list.
        cur.sort(new Comparator<ArrayList<Integer>>() {
            public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
                return o1.get(0).compareTo(o2.get(0));
            }
        });

        // using boolean list to mark visited elements and currently
        // marking all the nodes as false.
        boolean[] vis = new boolean[n];
        Arrays.fill(vis, false);

        int ans = 0;

        for (int i = 0; i < n; i++) {
            // if element is already visited or it is already at
            // correct position, we continue the loop.
            if (vis[i] || cur.get(i).get(1) == i)
                continue;
            else {
                int cycle_size = 0;
                int j = i;

                // while element is not visited, we find out the number of nodes
                // in this cycle and keep incrementing cycle size.
                while (!vis[j]) {
                    vis[j] = true;
                    j = cur.get(j).get(1);
                    cycle_size++;
                }
                // updating number of swaps required.
                ans += Math.max(0, cycle_size - 1);
            }
        }
        return ans;
    }
}