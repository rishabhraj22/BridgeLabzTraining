package com.stackqueue.StockSpanProblem;
import java.util.Stack;

public class StockSpan {

    // Method to calculate stock span
    public static int[] calculateSpan(int[] prices) {

        int n = prices.length;
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>(); // stores indices

        // First day span is always 1
        span[0] = 1;
        stack.push(0);

        // Calculate span for remaining days
        for (int i = 1; i < n; i++) {

            // Pop indices while price at those indices is <= current price
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }

            // If stack is empty, price is greater than all previous days
            span[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());

            // Push current index
            stack.push(i);
        }

        return span;
    }
}
