package com.stackqueue.ImplementQueueUsingStack;
import java.util.Stack;

public class QueueUsingStacks {

    private Stack<Integer> enqueueStack;
    private Stack<Integer> dequeueStack;

    // Constructor
    public QueueUsingStacks() {
        enqueueStack = new Stack<>();
        dequeueStack = new Stack<>();
    }

    // Enqueue operation
    public void enqueue(int data) {
        enqueueStack.push(data);
        System.out.println(data + " enqueued");
    }

    // Dequeue operation
    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty. Cannot dequeue.");
        }

        // Transfer only if dequeueStack is empty
        if (dequeueStack.isEmpty()) {
            while (!enqueueStack.isEmpty()) {
                dequeueStack.push(enqueueStack.pop());
            }
        }

        return dequeueStack.pop();
    }

    // Peek front element
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty. Cannot peek.");
        }

        if (dequeueStack.isEmpty()) {
            while (!enqueueStack.isEmpty()) {
                dequeueStack.push(enqueueStack.pop());
            }
        }

        return dequeueStack.peek();
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return enqueueStack.isEmpty() && dequeueStack.isEmpty();
    }
}
