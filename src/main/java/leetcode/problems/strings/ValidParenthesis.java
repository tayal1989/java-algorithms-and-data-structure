package leetcode.problems.strings;

import java.util.Stack;

public class ValidParenthesis {

    public static void main(String[] args) {
        System.out.println(checkValidString("()"));
        System.out.println(checkValidString("(*)"));
        System.out.println(checkValidString("(*))"));
        System.out.println(checkValidString("((((()(()()()*()(((((*)()*(**(())))))(())()())(((())())())))))))(((((())*)))()))(()((*()*(*)))(*)()"));
        System.out.println(checkValidString("(((((*(()((((*((**(((()()*)()()()*((((**)())*)*)))))))(())(()))())((*()()(((()((()*(())*(()**)()(())"));
    }

    public static boolean checkValidString(String s) {
        Stack<Integer> bracketStack = new Stack<>();
        Stack<Integer> starStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                bracketStack.push(i);
            } else if (ch == '*') {
                starStack.push(i);
            } else {
                if (!bracketStack.isEmpty()) {
                    bracketStack.pop();
                } else if (!starStack.isEmpty()) {
                    starStack.pop();
                } else {
                    return false;   // Nothing to match the ')'
                }
            }
        }

        // Phase 2: Match remaining '(' with '*'
        while (!bracketStack.isEmpty() && !starStack.isEmpty()) {
            // If the '(' appears AFTER the '*', the '*' cannot close it
            if (bracketStack.pop() > starStack.pop()) {
                return false;
            }
        }

        // If bracketStack is empty, all '(' were matched
        return bracketStack.isEmpty();
    }
}
