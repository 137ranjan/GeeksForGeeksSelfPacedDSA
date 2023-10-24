package Stack.BalancedParenthesis;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(isBalanced(str));
		sc.close();
	}

	private static boolean isBalanced(String str) {
		ArrayDeque<Character> stack = new ArrayDeque<Character>();
		for (int i = 0; i < str.length(); i++) {
			Character ch = str.charAt(i);
			if (ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			} else if (ch == ')' || ch == '}' || ch == ']') {
				if (stack.isEmpty()) {
					return false;
				}
				if (isMatching(stack.peek(), ch) == false) {
					return false;
				} else {
					stack.pop();
				}
			}
		}
		return stack.isEmpty();
	}

	private static boolean isMatching(char s, char ch) {
		return (s == '(' && ch == ')')
				|| (s == '{' && ch == '}')
				|| (s == '[' && ch == ']');
	}
}