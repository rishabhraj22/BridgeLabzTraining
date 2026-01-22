package com.collections.queueinterface.reversequeue;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        Queue<Integer> queue = new ArrayDeque<>();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            queue.add(sc.nextInt());
        }

        System.out.println("Original Queue: " + queue);

        QueueReverser.reverseQueue(queue);

        System.out.println("Reversed Queue: " + queue);
    }
}
