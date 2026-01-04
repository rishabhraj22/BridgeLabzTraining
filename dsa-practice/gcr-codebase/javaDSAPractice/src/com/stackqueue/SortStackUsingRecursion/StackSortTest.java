package com.stackqueue.SortStackUsingRecursion;
import java.util.Stack;

public class StackSortTest {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(30);
        stack.push(10);
        stack.push(50);
        stack.push(20);

        System.out.println("Original Stack: " + stack);

        SortedStack.sortStack(stack);

        System.out.println("Sorted Stack (Ascending): " + stack);
    }
}
