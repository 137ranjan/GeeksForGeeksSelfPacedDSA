public class Solution {
    public static void main(String[] args) {
        String s1 = "AAAAAA";
        String s2 = "AAA";
        rbPatternSearch(s1, s2);
    }

    private static void rbPatternSearch(String txt, String pat) {
        int m = pat.length();
        int n = txt.length();

        char[] txtArr = txt.toCharArray();
        char[] patArr = pat.toCharArray();

        int h = 1;
        int d = 5;
        int q = 13;
        for (int i = 1; i < m - 1; i++) {
            h = (h * d) % q;
        }
        int p = 0;
        int t = 0;
        for (int i = 0; i < m; i++) {
            p = (p * d + patArr[i]) % q;
            t = (t * d + txtArr[i]) % q;
        }
        for (int i = 0; i <= n - m; i++) {
            if (p == t) {
                boolean flag = true;
                for (int j = 0; j < m; j++) {
                    if (txtArr[i + j] != patArr[j]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    System.out.print(i + " ");
                }
            }

            if (i < n - m) {
                t = (d * (t - txtArr[i] * h) + txtArr[i + m]) % q;
                if (t < 0) {
                    t = t + q;
                }
            }
        }
    }
}