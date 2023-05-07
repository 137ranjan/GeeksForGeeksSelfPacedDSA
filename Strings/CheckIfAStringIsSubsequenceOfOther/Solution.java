public class Solution {
    public static void main(String[] args) {
        String s1 = "ABCDE";
        String s2 = "AD";

        boolean result = isSubSeq(s1, s2);
        if (result) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    private static boolean isSubSeq(String s1, String s2) {
        if (s1.length() < s2.length()) {
            return false;
        }
        int j = 0;
        for (int i = 0; i < s1.length() && j < s2.length(); i++) {
            if (s1.charAt(i) == s2.charAt(j)) {
                j++;
            }
        }
        return (j == s2.length());
    }
}