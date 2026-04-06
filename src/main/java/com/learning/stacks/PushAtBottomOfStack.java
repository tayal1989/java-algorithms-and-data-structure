package com.learning.stacks;

import java.util.Stack;

public class PushAtBottomOfStack {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        pushAtBottom(4, stack);

        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }

    public static void pushAtBottom(int data, Stack<Integer> stack) {
        if (stack.isEmpty()) {
            stack.push(data);
            return;
        }

        int top = stack.pop();
        pushAtBottom(data, stack);
        stack.push(top);
    }
}
