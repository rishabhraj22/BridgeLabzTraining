package com.printshopjobscheduler;
public class PrintShopMain {

    public static void main(String[] args) {

        System.out.println("Starting print jobs...\n");

        long startTime = System.currentTimeMillis();

        // Create 5 print jobs as per problem statement
        PrintJobThread job1 = new PrintJobThread("Job1", 10, 5); // 10 pages, Priority 5
        PrintJobThread job2 = new PrintJobThread("Job2", 5, 8);  // 5 pages, Priority 8
        PrintJobThread job3 = new PrintJobThread("Job3", 15, 3); // 15 pages, Priority 3
        PrintJobThread job4 = new PrintJobThread("Job4", 8, 6);  // 8 pages, Priority 6
        PrintJobThread job5 = new PrintJobThread("Job5", 12, 7); // 12 pages, Priority 7

        // Start all jobs (they compete for CPU based on priority)
        job1.start();
        job2.start();
        job3.start();
        job4.start();
        job5.start();

        // Wait for all jobs to finish
        try {
            job1.join();
            job2.join();
            job3.join();
            job4.join();
            job5.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted while waiting for jobs.");
        }

        long endTime = System.currentTimeMillis();

        System.out.println("All jobs completed in " + (endTime - startTime) + " ms");
    }
}
