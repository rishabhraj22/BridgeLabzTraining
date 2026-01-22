package com.collections.queueinterface.stackusingqueue;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StackUsingQueues stack = new StackUsingQueues();

        System.out.print("Enter number of elements to push: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            stack.push(sc.nextInt());
        }

        System.out.println("Top element: " + stack.top());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("New top: " + (stack.isEmpty() ? "Empty" : stack.top()));
    }
}
