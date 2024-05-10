public class Solution {
    public static void main(String[] args) {
        System.out.println(eggDrop(10, 2));
    }

    /*
     * Function to get minimum number of trials needed in worst case with n eggs and
     * k floors
     */
    private static int eggDrop(int f, int e) {
        // If there are no floors, then no trials needed. OR if there is one floor, one
        // trial needed.
        if (f == 1 || f == 0) {
            return f;
        }

        // We need f trials for one egg and f floors
        if (e == 1) {
            return f;
        }
        // Consider all droppings from 1st floor to kth floor and return the minimum of
        // these values plus 1.
        int min = Integer.MAX_VALUE;
        int x;
        int res;
        for (x = 1; x <= f; x++) {
            res = Math.max(eggDrop(f - 1, e - 1), eggDrop(f - x, e));

            if (res < min) {
                min = res;
            }
        }

        return min + 1;
    }
}