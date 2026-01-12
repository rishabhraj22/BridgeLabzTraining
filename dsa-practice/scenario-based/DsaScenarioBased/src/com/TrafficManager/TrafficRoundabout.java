package com.TrafficManager;
import java.util.LinkedList;
import java.util.Queue;

public class TrafficRoundabout {

    private VehicleNode head;
    private VehicleNode tail;
    private Queue<String> waitingQueue;
    private int maxQueueSize;

    public TrafficRoundabout(int maxQueueSize) {
        head = null;
        tail = null;
        waitingQueue = new LinkedList<>();
        this.maxQueueSize = maxQueueSize;
    }

    // Add vehicle directly into roundabout
    public void addVehicleToRoundabout(String vehicleNumber) {

        VehicleNode newNode = new VehicleNode(vehicleNumber);

        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }

        System.out.println("Vehicle entered roundabout: " + vehicleNumber);
    }

    // Remove vehicle from roundabout
    public void removeVehicleFromRoundabout(String vehicleNumber) {

        if (head == null) {
            System.out.println("No vehicles in roundabout.");
            return;
        }

        VehicleNode current = head;
        VehicleNode prev = tail;

        do {
            if (current.vehicleNumber.equalsIgnoreCase(vehicleNumber)) {

                if (current == head && current == tail) {
                    head = null;
                    tail = null;
                } else {
                    prev.next = current.next;

                    if (current == head) {
                        head = current.next;
                        tail.next = head;
                    }

                    if (current == tail) {
                        tail = prev;
                        tail.next = head;
                    }
                }

                System.out.println("Vehicle exited roundabout: " + vehicleNumber);
                return;
            }

            prev = current;
            current = current.next;

        } while (current != head);

        System.out.println("Vehicle not found in roundabout.");
    }

    // Add vehicle to waiting queue
    public void addVehicleToQueue(String vehicleNumber) {

        if (waitingQueue.size() >= maxQueueSize) {
            System.out.println("Waiting queue overflow. Cannot add vehicle.");
            return;
        }

        waitingQueue.offer(vehicleNumber);
        System.out.println("Vehicle added to waiting queue: " + vehicleNumber);
    }

    // Move vehicle from queue to roundabout
    public void moveFromQueueToRoundabout() {

        if (waitingQueue.isEmpty()) {
            System.out.println("Waiting queue underflow. No vehicles to move.");
            return;
        }

        String vehicleNumber = waitingQueue.poll();
        addVehicleToRoundabout(vehicleNumber);
    }

    // Display roundabout state
    public void displayRoundabout() {

        if (head == null) {
            System.out.println("Roundabout is empty.");
            return;
        }

        System.out.println("Current vehicles in roundabout:");

        VehicleNode temp = head;

        do {
            System.out.println(temp.vehicleNumber);
            temp = temp.next;
        } while (temp != head);
    }

    // Display waiting queue
    public void displayQueue() {

        if (waitingQueue.isEmpty()) {
            System.out.println("Waiting queue is empty.");
            return;
        }

        System.out.println("Vehicles in waiting queue:");
        for (String v : waitingQueue) {
            System.out.println(v);
        }
    }
}
