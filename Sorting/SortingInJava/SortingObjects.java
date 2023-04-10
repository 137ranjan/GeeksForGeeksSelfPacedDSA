import java.util.Arrays;

public class SortingObjects {
    public static void main(String[] args) {
        Point[] arr = {new Point(10,20), new Point(3,12), new Point(5,7)};
        Arrays.sort(arr);
        for (Point point : arr) {
            System.out.println("("+point.x+", "+point.y+")");
        }
    }
}


