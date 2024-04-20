import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        Activity[] input = new Activity[4];
        input[0] = new Activity(3, 8);
        input[1] = new Activity(2, 4);
        input[2] = new Activity(1, 3);
        input[3] = new Activity(10, 11);

        System.out.println(maxActivity(input));

    }

    public static int maxActivity(Activity[] arr) {
        // sort according to finish time
        Arrays.sort(arr);
        int res = 1;
        int prev = 0;
        for (int curr = 1; curr < arr.length; curr++) {
            if (arr[curr].start >= arr[prev].finish) {
                res++;
                prev = curr;
            }
        }
        return res;
    }

    private static class Activity implements Comparable<Activity> {
        int start;
        int finish;

        Activity(int start, int finish) {
            this.start = start;
            this.finish = finish;
        }

        @Override
        public int compareTo(Activity a) {
            return (this.finish - a.finish);
        }

        @Override
        public String toString() {
            return "(" + start + "," + finish + ")";
        }
    }
}