/*
 * Print all permutations of String "ABC", except the strings containing "AB" as substring.
*/

class Permutations {
    public static void main(String[] args) {
        String str = "ABC";
        char[] strArr = str.toCharArray();
        permute(strArr, 0, 2);

    }

    public static void printStrArr(char[] strArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            sb.append(strArr[i]);
        }
        System.out.println(sb);
    }

    public static void swap(char[] strArr, int i, int j) {
        char temp = strArr[i];
        strArr[i] = strArr[j];
        strArr[j] = temp;
    }

    public static boolean isSafe(char[] strArr, int l, int i, int r) {
        if (l != 0 && strArr[l - 1] == 'A' && strArr[i] == 'B') {
            return false;
        }
        if (r == (l + 1) && ((strArr[i] == 'A' && strArr[l] == 'B') || (strArr[i] == 'A' && strArr[r] == 'B'))) {
            return false;
        }
        return true;
    }

    public static void permute(char[] strArr, int l, int r) {
        if (l == r) {
            printStrArr(strArr);
            return;
        } else {
            for (int i = l; i <= r; i++) {
                if (isSafe(strArr, l, i, r)) {
                    swap(strArr, l, i);
                    permute(strArr, l + 1, r);
                    swap(strArr, l, i);
                }

            }
        }
    }
}