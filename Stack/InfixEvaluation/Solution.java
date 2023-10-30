import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String prefix = br.readLine();
        int result = evaluatePrefix(prefix);
        System.out.println("result = " + result);
    }

    private static int evaluatePrefix(String prefix) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = prefix.length() - 1; i >= 0; i--) {
            char ch = prefix.charAt(i);
            if (Character.isDigit(ch)) {
                stack.push((int) ch - '0');
            } else {
                int op1 = stack.pop();
                int op2 = stack.pop();
                switch (ch) {
                    case '+' -> stack.push(op2 + op1);
                    case '-' -> stack.push(op2 - op1);
                    case '*' -> stack.push(op1 * op2);
                    case '/' -> stack.push(op2 / op1);
                    case '^' -> stack.push((int) Math.pow(op2, op1));
                    default -> {
                    }
                }
            }
        }
        return stack.pop();
    }
}