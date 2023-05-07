public class Solution {
    public static void main(String[] args) {
        String str = "geeks";
        System.out.println(str.length());
        System.out.println(str.charAt(3));
        System.out.println(str.substring(2));
        System.out.println(str.substring(2, 5));

        String s1 = "geeks";
        String s2 = "geeks";

        if (s1 == s2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        String s3 = new String("geeks");

        if (s1 == s3) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        String s4 = "geeksforgeeks";
        String s5 = "geeks";
        System.out.println(s4.contains(s5));

        System.out.println(s1.equals(s3));

        String s6 = "for";

        int res = s1.compareTo(s6);
        if (res == 0) {
            System.out.println("Same");
        } else if (res > 0) {
            System.out.println("s1 Greater");
        } else if (res < 0) {
            System.out.println("s1 Smaller");
        }

        System.out.println(s4.indexOf(s5));
    }
}