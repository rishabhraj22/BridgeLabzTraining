package com.threadstatemonitoringsystem;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StateMonitor extends Thread {

    private Thread[] threadsToMonitor;
    private Map<String, Set<Thread.State>> observedStates = new HashMap<>();

    public StateMonitor(Thread... threads) {
        this.threadsToMonitor = threads;
        setName("Monitor");
    }

    @Override
    public void run() {
        boolean allTerminated = false;

        // Initialize state sets
        for (Thread t : threadsToMonitor) {
            observedStates.put(t.getName(), new HashSet<>());
        }

        while (!allTerminated) {
            allTerminated = true;

            for (Thread t : threadsToMonitor) {
                Thread.State state = t.getState();
                String time = LocalTime.now().withNano(0).toString();

                // Log state
                System.out.println("[Monitor] " + t.getName() + " is in " + state + " state at " + time);

                // Track unique states for summary
                observedStates.get(t.getName()).add(state);

                if (state != Thread.State.TERMINATED) {
                    allTerminated = false;
                }
            }

            // Sleep 500 ms between checks
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("StateMonitor interrupted.");
                break;
            }
        }

        // Print summary
        System.out.println("\n===== Summary =====");
        for (Map.Entry<String, Set<Thread.State>> entry : observedStates.entrySet()) {
            System.out.println("Summary: " + entry.getKey() + " went through " + entry.getValue().size() + " states -> " + entry.getValue());
        }
    }
}
