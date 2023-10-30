import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String infix = br.readLine();
        System.out.println(infixToPrefix(infix));
    }

    private static String infixToPrefix(String infix) {
        String prefixRev = "";
        ArrayDeque<Character> stack = new ArrayDeque<>();

        Map<Character, Integer> precedenceMap = new HashMap<>();
        precedenceMap.put('-', 1);
        precedenceMap.put('+', 1);
        precedenceMap.put('/', 2);
        precedenceMap.put('*', 2);
        precedenceMap.put('^', 3);

        for (int i = infix.length() - 1; i >= 0; i--) {
            char ch = infix.charAt(i);
            if (Character.isLetter(ch)) {
                prefixRev += ch;
            } else if (ch == ')') {
                stack.push(ch);
            } else if (ch == '(') {
                while (!stack.isEmpty() && stack.peek() != ')') {
                    prefixRev += stack.pop();
                }
                if (stack.isEmpty()) {
                    return "Invalid Expression";
                } else {
                    stack.pop();
                }
            } else if (ch == '^' || ch == '*' || ch == '/' || ch == '+' || ch == '-') {
                if (stack.isEmpty()) {
                    stack.push(ch);
                } else {
                    char top = stack.peek();
                    if (precedenceMap.get(top) < precedenceMap.get(ch)) {
                        stack.push(ch);
                    } else if (precedenceMap.get(top) > precedenceMap.get(ch)) {
                        while (!stack.isEmpty() && precedenceMap.get(top) >= precedenceMap.get(ch)) {
                            prefixRev += stack.pop();
                            if (!stack.isEmpty()) {
                                top = stack.peek();
                            }
                        }
                        stack.push(ch);
                    } else {
                        if (ch == '^') {
                            stack.push(ch);
                        } else {
                            while (precedenceMap.get(top) >= precedenceMap.get(ch)) {
                                prefixRev += stack.pop();
                                top = stack.peek();
                            }
                            stack.push(ch);
                        }
                    }
                }
            }
        }
        while (!stack.isEmpty()) {
            prefixRev += stack.pop();
        }
        StringBuilder sb = new StringBuilder(prefixRev);
        sb = sb.reverse();
        return sb.toString();
    }
}