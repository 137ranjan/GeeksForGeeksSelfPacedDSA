import java.util.Arrays;
import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        Integer[] arr = {15, 12, 13, 12, 13, 13, 18};
        System.out.println(countDistinct(arr));
    }

    private static int countDistinct(Integer[] arr) {
        HashSet<Integer> set = new HashSet<>(Arrays.asList(arr));
        return set.size();
    }
}
