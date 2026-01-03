package com.linkedlist.TaskScheduler;

public class Main {

    public static void main(String[] args) {

        CircularTaskList scheduler = new CircularTaskList();

        scheduler.addAtEnd(1, "Design Module", 1, "10-01-2026");
        scheduler.addAtEnd(2, "Implement Code", 2, "12-01-2026");
        scheduler.addAtBeginning(3, "Requirement Analysis", 1, "08-01-2026");

        System.out.println("All Tasks:");
        scheduler.displayAll();

        System.out.println("\nNext Tasks (Scheduler Rotation):");
        scheduler.viewNextTask();
        scheduler.viewNextTask();
        scheduler.viewNextTask();

        System.out.println("\nSearch by Priority:");
        scheduler.searchByPriority(1);

        scheduler.removeByTaskId(2);

        System.out.println("\nAfter Deletion:");
        scheduler.displayAll();
    }
}

