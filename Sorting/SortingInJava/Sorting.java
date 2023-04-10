import java.util.Arrays;

public class Sorting {

    public static void main(String[] args) {
        int arr1[] = { 5, 20, 12, 30 };
        char arr2[] = { 'B', 'B', 'A', 'C', 'A' };
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}