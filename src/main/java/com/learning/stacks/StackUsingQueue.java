package com.learning.stacks;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    Queue<Integer> queue = new LinkedList<>();

    public void push(int data) {
        queue.add(data);    // Add element, let's say queue was [1, 2]
                            // After push(3), queue will become [1, 2, 3]

        /*
        Start: [1, 2, 3]
        🔄 Iteration 1:
            remove → 1
            add → [2, 3, 1]
        🔄 Iteration 2:
            remove → 2
            add → [3, 1, 2]
        👉 Final queue:
            [3, 1, 2]
        🔥 Now 3 is at the front → behaves like a stack
         */
        for (int i = 0; i < queue.size() - 1; i++) {
            queue.add(queue.remove());
        }
    }

    public int top() {
        if (queue.isEmpty()) {
            return -1;
        }
        return queue.peek();
    }

    public int pop() {
        if (queue.isEmpty()) {
            return -1;
        }
        return queue.remove();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        StackUsingQueue sq = new StackUsingQueue();
        sq.push(1);
        sq.push(2);
        sq.push(3);

        while (! sq.isEmpty()) {
            System.out.println(sq.top());
            sq.pop();
        }
    }
}
