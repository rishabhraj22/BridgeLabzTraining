package com.threadstatemonitoringsystem;
public class TaskRunner extends Thread {

    public TaskRunner(String name) {
        setName(name);
    }

    @Override
    public void run() {
        // Phase 1: Do some computation (RUNNABLE)
        long sum = 0;
        for (int i = 0; i < 5_000_000; i++) {
            sum += i;
        }

        // Phase 2: Sleep for 2 seconds (TIMED_WAITING)
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(getName() + " interrupted during sleep.");
        }

        // Phase 3: Finish (TERMINATED when run() exits)
    }
}
