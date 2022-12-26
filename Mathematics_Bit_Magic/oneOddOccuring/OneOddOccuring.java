package oneOddOccuring;

public class OneOddOccuring {
    public static void main(String[] args) {
        int[] arr = { 4, 4, 7, 4, 8, 7, 7, 7, 8 };
        findOdd(arr);
    }

    private static void findOdd(int[] arr) {
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result = result ^ arr[i];
        }
        System.out.println(result);
    }
}
