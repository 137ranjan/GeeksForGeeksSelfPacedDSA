public class SumOfIntegers {
    public static void main(String[] args) {
        int n = 253;
        int res = sum(n);
        System.out.println(res);

    }

    private static int sum(int n) {
        if (n == 0) {
            return n;
        }
        return n % 10 + sum(n / 10);
    }
}