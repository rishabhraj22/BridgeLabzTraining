package com.stackqueue.SortStackUsingRecursion;
import java.util.Stack;

public class SortedStack {

    // Sort the entire stack using recursion
    public static void sortStack(Stack<Integer> stack) {
        // Base case
        if (stack.isEmpty()) {
            return;
        }

        // Step 1: Remove the top element
        int top = stack.pop();

        // Step 2: Sort the remaining stack
        sortStack(stack);

        // Step 3: Insert the element back in sorted order
        insertInSortedOrder(stack, top);
    }

    // Helper method to insert an element at correct position
    private static void insertInSortedOrder(Stack<Integer> stack, int element) {

        // Base case: correct position found
        if (stack.isEmpty() || stack.peek() <= element) {
            stack.push(element);
            return;
        }

        // Remove top and recur
        int top = stack.pop();
        insertInSortedOrder(stack, element);

        // Restore the removed element
        stack.push(top);
    }
}
