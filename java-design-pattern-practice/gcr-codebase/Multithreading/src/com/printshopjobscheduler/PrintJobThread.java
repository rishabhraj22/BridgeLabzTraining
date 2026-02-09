package com.printshopjobscheduler;
public class PrintJobThread extends Thread {

    private String jobName;
    private int pages;
    private int jobPriority; // 1 to 10 (used to set thread priority)

    public PrintJobThread(String jobName, int pages, int jobPriority) {
        this.jobName = jobName;
        this.pages = pages;
        this.jobPriority = jobPriority;
        setName(jobName);
        setPriority(jobPriority); // Set thread priority based on job priority
    }

    @Override
    public void run() {
        String priorityLabel = getPriorityLabel(jobPriority);

        for (int i = 1; i <= pages; i++) {
            System.out.println("[" + priorityLabel + "] Printing " + jobName + " - Page " + i + " of " + pages);
            try {
                Thread.sleep(100); // 100ms per page
            } catch (InterruptedException e) {
                System.out.println(jobName + " was interrupted.");
            }
        }

        System.out.println(jobName + " completed printing.\n");
    }

    private String getPriorityLabel(int p) {
        if (p >= 8) {
            return "High Priority";
        } else if (p >= 5) {
            return "Medium Priority";
        } else {
            return "Low Priority";
        }
    }
}
