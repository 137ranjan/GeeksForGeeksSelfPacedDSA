import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] nums = { 10, 19, 6, 3, 5 };
        System.out.println(minSwaps(nums));
    }

    public static int minSwaps(int nums[]) {
        Pair[] pairs = new Pair[nums.length];
        for (int i = 0; i < nums.length; i++) {
            pairs[i] = new Pair(nums[i], i);
            pairs[i].value = nums[i];
            pairs[i].index = i;
        }
        Arrays.sort(pairs);
        int swap = 0;
        for (int i = 0; i < pairs.length; i++) {
            int index = pairs[i].index;
            if (pairs[i].index != i) {
                swap++;
                Pair temp = pairs[i];
                pairs[i] = pairs[index];
                pairs[index] = temp;
                i--;
            }

        }
        return swap;
    }

    public static class Pair implements Comparable<Pair> {
        int value;
        int index;

        Pair(int value, int index) {
            this.value = value;
            this.index = index;
        }

        @Override
        public int compareTo(Pair p) {
            if (this.value < p.value) {
                return -1;
            } else if (this.value > p.value) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}