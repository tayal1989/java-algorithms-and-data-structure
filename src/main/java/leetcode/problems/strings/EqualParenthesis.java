package leetcode.problems.strings;

import java.util.Stack;

public class EqualParenthesis {

    public static void main(String[] args) {
        System.out.println(isStringValid("()"));
        System.out.println(isStringValid("()[]{}"));
        System.out.println(isStringValid("(]"));
        System.out.println(isStringValid("(())"));
    }

    public static boolean isStringValid(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) { return false; }

                char top = stack.pop();
                if ((top == '[' && ch != ']') || (top == '{' && ch != '}') || (top == '(' && ch != ')')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
