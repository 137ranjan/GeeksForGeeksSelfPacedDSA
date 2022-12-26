import java.time.LocalDateTime;

class SumOfIntegers {
    public static void main(String[] args) {
        LocalDateTime startInstant = LocalDateTime.now();
        System.out.println(func1(9000));
        LocalDateTime endInstant = LocalDateTime.now();
        System.out.println("Time taken By func1() :"+(endInstant.getNano() - startInstant.getNano()));

        startInstant = LocalDateTime.now();
        System.out.println(func2(9000));
        endInstant = LocalDateTime.now();
        System.out.println("Time taken By func2() :"+(endInstant.getNano() - startInstant.getNano()));

        startInstant = LocalDateTime.now();
        System.out.println(func2(9000));
        endInstant = LocalDateTime.now();
        System.out.println("Time taken By func3() :"+(endInstant.getNano() - startInstant.getNano()));

    }

    public static int func1(int n) {
        return (n * (n + 1)) / 2;
    }

    public static int func2(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int func3(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++)
            for (int j = i; j <= n; j++) {
                sum++;
            }

        return sum;
    }
}