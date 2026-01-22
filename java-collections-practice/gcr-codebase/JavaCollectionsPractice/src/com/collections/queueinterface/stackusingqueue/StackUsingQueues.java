package com.collections.queueinterface.stackusingqueue;
import java.util.*;

public class StackUsingQueues {

    private Queue<Integer> q1 = new ArrayDeque<>();
    private Queue<Integer> q2 = new ArrayDeque<>();

    // Push operation
    public void push(int x) {
        q2.add(x);

        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }

        // swap queues
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    // Pop operation
    public int pop() {
        if (q1.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return q1.remove();
    }

    // Top operation
    public int top() {
        if (q1.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return q1.peek();
    }

    // Check empty
    public boolean isEmpty() {
        return q1.isEmpty();
    }
}
