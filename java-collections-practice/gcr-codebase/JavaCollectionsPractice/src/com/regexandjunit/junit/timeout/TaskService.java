package com.regexandjunit.junit.timeout;

public class TaskService {

    public String longRunningTask() {
        try {
            Thread.sleep(3000); // 3 seconds
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return "Task Completed";
    }
}
