package twoOddOccuring;

public class TwoOddOccuring {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 10, 6, 10, 6, 3, 3 };

        int x = arr[0];
        for (int i = 1; i < arr.length; i++) {
            x = x ^ arr[i];
        }
        int k = (x & (~(x - 1)));
        int res = 0, res2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] & k) != 0) {
                res = res ^ arr[i];
            } else {
                res2 = res2 ^ arr[i];
            }
        }
        System.out.println(res);
        System.out.println(res2);
    }
}
