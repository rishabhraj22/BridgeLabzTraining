package com.threadstatemonitoringsystem;
public class ThreadStateMain {

    public static void main(String[] args) {

        // Create 2 TaskRunner threads
        TaskRunner task1 = new TaskRunner("Task-1");
        TaskRunner task2 = new TaskRunner("Task-2");

        // At this point, both are in NEW state
        System.out.println("Initial States:");
        System.out.println(task1.getName() + ": " + task1.getState());
        System.out.println(task2.getName() + ": " + task2.getState());
        System.out.println();

        // Create and start StateMonitor
        StateMonitor monitor = new StateMonitor(task1, task2);
        monitor.start();

        // Start tasks
        task1.start();
        task2.start();

        // Wait for tasks to finish
        try {
            task1.join();
            task2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted while waiting.");
        }

        // Wait for monitor to finish
        try {
            monitor.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted while waiting for monitor.");
        }

        System.out.println("\nMain thread exiting.");
    }
}
