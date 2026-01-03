package com.linkedlist.RoundRobinScheduler;

public class CircularProcessList {

    private Process head;
    private Process tail;

    /* Add process at end */
    public void addProcess(int pid, int burstTime, int priority) {
        Process newNode = new Process(pid, burstTime, priority);

        if (head == null) {
            head = tail = newNode;
            newNode.next = head;
            return;
        }

        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
    }

    /* Remove process by ID */
    private void removeProcess(Process prev, Process curr) {
        if (curr == head && curr == tail) {
            head = tail = null;
        } else if (curr == head) {
            head = head.next;
            tail.next = head;
        } else if (curr == tail) {
            tail = prev;
            tail.next = head;
        } else {
            prev.next = curr.next;
        }
    }

    /* Display processes */
    public void displayProcesses() {
        if (head == null) {
            System.out.println("No processes in queue");
            return;
        }

        Process temp = head;
        do {
            System.out.println(
                    "PID: " + temp.processId +
                    ", Remaining Time: " + temp.remainingTime
            );
            temp = temp.next;
        } while (temp != head);
    }

    /* Round Robin Scheduling */
    public void schedule(int timeQuantum) {
        if (head == null) {
            System.out.println("No processes to schedule");
            return;
        }

        int currentTime = 0;
        int completed = 0;
        int totalWaitingTime = 0;
        int totalTurnaroundTime = 0;

        Process curr = head;
        Process prev = tail;

        while (head != null) {

            if (curr.remainingTime > 0) {

                int executionTime = Math.min(timeQuantum, curr.remainingTime);
                curr.remainingTime -= executionTime;
                currentTime += executionTime;

                System.out.println(
                        "\nExecuting Process " + curr.processId +
                        " for " + executionTime + " units"
                );

                displayProcesses();

                if (curr.remainingTime == 0) {
                    curr.turnaroundTime = currentTime;
                    curr.waitingTime = curr.turnaroundTime - curr.burstTime;

                    totalWaitingTime += curr.waitingTime;
                    totalTurnaroundTime += curr.turnaroundTime;
                    completed++;

                    removeProcess(prev, curr);
                    curr = prev.next;
                    continue;
                }
            }

            prev = curr;
            curr = curr.next;
        }

        System.out.println("\n--- Scheduling Completed ---");
        System.out.println("Average Waiting Time: " +
                (double) totalWaitingTime / completed);
        System.out.println("Average Turnaround Time: " +
                (double) totalTurnaroundTime / completed);
    }
}

