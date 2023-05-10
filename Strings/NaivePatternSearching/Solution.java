public class Solution {
    public static void main(String[] args) {
        String s1 = "AAAAAA";
        String s2 = "AAA";
        patternSearch(s1, s2);
    }

    private static void patternSearch(String txt, String pat) {
        int m = pat.length();
        int n = txt.length();

        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (pat.charAt(j) != txt.charAt(i + j)) {
                    break;
                }
            }
            if (j == m) {
                System.out.print(i + " ");
            }
        }
    }
}