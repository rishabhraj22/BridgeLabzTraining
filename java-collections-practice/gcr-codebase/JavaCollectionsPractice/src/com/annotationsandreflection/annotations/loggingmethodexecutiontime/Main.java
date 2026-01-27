package com.annotationsandreflection.annotations.loggingmethodexecutiontime;

public class Main {
    public static void main(String[] args) throws Exception {

        TaskService service = new TaskService();
        ExecutionTimeProcessor.execute(service);
    }
}
