class Solution {
    public static void main(String[] args) {
        String s = "geek";
        int i = 0;
        int j = 3;
        System.out.println(palPart(s, i, j));
    }

    private static boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    // Recursive solution
    private static int palPart(String s, int i, int j) {
        if (isPalindrome(s, i, j)) {
            return 0;
        }
        int res = Integer.MAX_VALUE;
        for (int k = i; k < j; k++) {
            res = Math.min(res, 1 + palPart(s, i, k) + palPart(s, k + 1, j));
        }
        return res;
    }
}