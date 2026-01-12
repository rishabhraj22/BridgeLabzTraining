package com.CallCenter;
import java.util.*;

public class CallCenterManager {

    private Queue<Customer> normalQueue;
    private PriorityQueue<Customer> vipQueue;
    private HashMap<String, Integer> callCountMap;

    public CallCenterManager() {
        normalQueue = new LinkedList<>();
        vipQueue = new PriorityQueue<>(new VIPComparator());
        callCountMap = new HashMap<>();
    }

    // Add incoming call
    public void addCall(Customer customer) {

        if (customer.isVIP()) {
            vipQueue.offer(customer);
        } else {
            normalQueue.offer(customer);
        }

        // Update call count
        callCountMap.put(customer.getCustomerId(),
                callCountMap.getOrDefault(customer.getCustomerId(), 0) + 1);

        System.out.println("Call added for: " + customer.getName());
    }

    // Handle next call
    public void handleNextCall() {

        Customer nextCustomer = null;

        if (!vipQueue.isEmpty()) {
            nextCustomer = vipQueue.poll();
        } else if (!normalQueue.isEmpty()) {
            nextCustomer = normalQueue.poll();
        }

        if (nextCustomer != null) {
            System.out.println("Handling call for: " + nextCustomer);
        } else {
            System.out.println("No calls in queue.");
        }
    }

    // Display call counts
    public void displayCallCounts() {

        if (callCountMap.isEmpty()) {
            System.out.println("No call data available.");
            return;
        }

        System.out.println("Customer Call Counts This Month:");
        for (Map.Entry<String, Integer> entry : callCountMap.entrySet()) {
            System.out.println("Customer ID: " + entry.getKey() + " -> Calls: " + entry.getValue());
        }
    }

    // Display queues
    public void displayQueues() {

        System.out.println("\nVIP Queue:");
        if (vipQueue.isEmpty()) {
            System.out.println("Empty");
        } else {
            for (Customer c : vipQueue) {
                System.out.println(c);
            }
        }

        System.out.println("\nNormal Queue:");
        if (normalQueue.isEmpty()) {
            System.out.println("Empty");
        } else {
            for (Customer c : normalQueue) {
                System.out.println(c);
            }
        }
    }
}
