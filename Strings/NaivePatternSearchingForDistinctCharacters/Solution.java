public class Solution {
    public static void main(String[] args) {
        String s1 = "ABCABCDABCD";
        String s2 = "ABCD";
        patternSearch(s1, s2);
    }

    private static void patternSearch(String txt, String pat) {
        int m = pat.length();
        int n = txt.length();

        for (int i = 0; i <= n - m;) {
            int j;
            for (j = 0; j < m; j++) {
                if (pat.charAt(j) != txt.charAt(i + j)) {
                    break;
                }
            }
            if (j == m) {
                System.out.print(i + " ");
            }
            if (j == 0) {
                i++;
            } else {
                i = i + j;
            }
        }
    }
}