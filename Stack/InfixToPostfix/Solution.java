import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.HashMap;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String infix = sc.next();
		sc.close();
		System.out.println(infixToPostfix(infix));
	}

	private static String infixToPostfix(String infix) {
		String postfix = "";
		ArrayDeque<Character> stack = new ArrayDeque<>();

		HashMap<Character, Integer> precdenceMap = new HashMap<>();
		precdenceMap.put('-', 1);
		precdenceMap.put('+', 1);
		precdenceMap.put('/', 2);
		precdenceMap.put('*', 2);
		precdenceMap.put('^', 3);

		for (int i = 0; i < infix.length(); i++) {
			char ch = infix.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				postfix += ch;
			} else if (ch == '(') {
				stack.push(ch);
			} else if (ch == ')') {
				while (!stack.isEmpty() || stack.peek() == '(') {
					postfix += stack.pop();
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
					if (precdenceMap.get(top) < precdenceMap.get(ch)) {
						stack.push(ch);
					} else if (precdenceMap.get(top) > precdenceMap.get(ch)) {
						while (!stack.isEmpty() && precdenceMap.get(top) >= precdenceMap.get(ch)) {
							postfix += stack.pop();
							if(!stack.isEmpty()){
								top = stack.peek();
							}
						}
						stack.push(ch);
					} else {
						if (ch == '^') {
							stack.push(ch);
						} else {
							while (precdenceMap.get(top) >= precdenceMap.get(ch)) {
								postfix += stack.pop();
								top = stack.peek();
							}
							stack.push(ch);
						}
					}
				}
			}
		}
		while (!stack.isEmpty()) {
			postfix += stack.pop();
		}
		return postfix;
	}
}