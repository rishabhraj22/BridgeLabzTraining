package com.annotationsandreflection.annotations.annotationreflection;

public class TaskManager {

    @TaskInfo(priority = "High", assignedTo = "Rishabh")
    public void completeTask() {
        System.out.println("Task completed");
    }
}
