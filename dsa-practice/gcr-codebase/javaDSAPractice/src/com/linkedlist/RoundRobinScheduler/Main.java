package com.linkedlist.RoundRobinScheduler;

public class Main {

    public static void main(String[] args) {

        CircularProcessList scheduler = new CircularProcessList();

        scheduler.addProcess(1, 10, 1);
        scheduler.addProcess(2, 5, 2);
        scheduler.addProcess(3, 8, 1);

        int timeQuantum = 3;

        System.out.println("Initial Process Queue:");
        scheduler.displayProcesses();

        scheduler.schedule(timeQuantum);
    }
}


