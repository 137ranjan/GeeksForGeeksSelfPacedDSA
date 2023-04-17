import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        Interval[] arr = { new Interval(5, 10),
                new Interval(3, 15),
                new Interval(18, 30),
                new Interval(2, 7) };
        mergeIntervals(arr);
    }

    private static void mergeIntervals(Interval[] arr) {
        Arrays.sort(arr, new IntervalComparator());
        int res = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[res].getEnd() >= arr[i].getStart()) {
                arr[res].setEnd(Math.max(arr[res].getEnd(), arr[i].getEnd()));
                arr[res].setStart(Math.min(arr[res].getStart(), arr[i].getStart()));
            } else {
                res++;
                arr[res] = arr[i];
            }
        }
        for (int i = 0; i <= res; i++) {
            System.out.println(arr[i]);
        }
    }
}