import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String postfix = br.readLine();
        int result = evaluatePostfix(postfix);
        System.out.println("result = " + result);
    }

    private static int evaluatePostfix(String postfix) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < postfix.length(); i++) {
            char ch = postfix.charAt(i);
            if (Character.isDigit(ch)) {
                stack.push((int) ch - '0');
            } else {
                int op1 = stack.pop();
                int op2 = stack.pop();
                switch (ch) {
                    case '+':
                        stack.push(op2 + op1);
                        break;
                    case '-':
                        stack.push(op2 - op1);
                        break;
                    case '*':
                        stack.push(op1 * op2);
                        break;
                    case '/':
                        stack.push(op2 / op1);
                        break;
                    case '^':
                        stack.push((int) Math.pow(op2, op1));
                        break;
                    default:
                        break;
                }
            }
        }
        return stack.pop();
    }
}