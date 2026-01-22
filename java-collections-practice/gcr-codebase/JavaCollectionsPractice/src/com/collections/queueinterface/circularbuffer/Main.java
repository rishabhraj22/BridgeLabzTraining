package com.collections.queueinterface.circularbuffer;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter buffer size: ");
        int capacity = sc.nextInt();

        CircularBuffer buffer = new CircularBuffer(capacity);

        System.out.print("Enter number of insert operations: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            buffer.enqueue(sc.nextInt());
            buffer.display();
        }
    }
}
