/**
 * GFG
 */
public class GFG {

    public static void main(String[] args) {
        String str = "APPLE";
        String[] s = str.split("");
        permute(s, 0);
    }

    private static void permute(String[] s, int i) {
        if (i == s.length - 1) {
            for (int k = 0; k < s.length; k++) {
                System.out.print(s[k]);
            }
            System.out.print(" ");
        }

        for (int j = i; j < s.length; j++) {
            String temp = s[i];
            s[i] = s[j];
            s[j] = temp;

            permute(s, i + 1);

            String temp2 = s[i];
            s[i] = s[j];
            s[j] = temp2;

        }
    }

}