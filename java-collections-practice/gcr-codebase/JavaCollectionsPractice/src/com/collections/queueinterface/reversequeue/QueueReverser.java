package com.collections.queueinterface.reversequeue;
import java.util.*;

public class QueueReverser {

    public static void reverseQueue(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();

        // Step 1: Move queue → stack
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }

        // Step 2: Move stack → queue
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }
}
