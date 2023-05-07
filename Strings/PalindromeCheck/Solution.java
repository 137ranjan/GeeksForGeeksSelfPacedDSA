public class Solution {
    public static void main(String[] args) {
        String str = "abba";
        isPalindrome(str);
    }

    private static void isPalindrome(String str) {
        boolean flag = true;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                flag = false;
                break;
            }
        }

        if (flag)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}