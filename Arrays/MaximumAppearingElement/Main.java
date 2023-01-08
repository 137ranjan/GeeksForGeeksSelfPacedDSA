public class Main {
    public static void main(String[] args) {
        int[] left = { 1, 2, 4 };
        int[] right = { 4, 5, 7 };
        int[] freq = new int[100];

        for (int i = 0; i < left.length; i++) {
            freq[left[i]]++;
            freq[right[i] + 1]--;
        }
        for (int i = 1; i < freq.length; i++) {
            freq[i] = freq[i-1] + freq[i];
        }
        int res = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > freq[res]) {
                res = i;
            }
        }

        System.out.println(res);
    }
}