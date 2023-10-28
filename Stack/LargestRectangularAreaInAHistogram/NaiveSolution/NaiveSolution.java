public class NaiveSolution {
    public static void main(String[] args) {
        int[] arr = { 6, 2, 5, 4, 1, 5, 6 };
        int result = getMaxArea(arr);
        System.out.println(result);
    }

    private static int getMaxArea(int[] arr) {
        int res = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int curr = arr[i];
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] >= arr[i])
                    curr += arr[i];
                else
                    break;
            }
            for (int j = i + 1; j < n; j++) {
                if (arr[j] >= arr[i])
                    curr += arr[i];
                else
                    break;
            }

            res = Math.max(res, curr);
        }
        return res;
    }
}