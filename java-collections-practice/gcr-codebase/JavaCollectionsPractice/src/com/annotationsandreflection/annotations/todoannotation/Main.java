package com.annotationsandreflection.annotations.todoannotation;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

        Class<ProjectFeatures> cls = ProjectFeatures.class;

        for (Method method : cls.getDeclaredMethods()) {

            if (method.isAnnotationPresent(Todo.class)) {
                Todo todo = method.getAnnotation(Todo.class);

                System.out.println("Method: " + method.getName());
                System.out.println("Task: " + todo.task());
                System.out.println("Assigned To: " + todo.assignedTo());
                System.out.println("Priority: " + todo.priority());
                System.out.println("-------------------------");
            }
        }
    }
}
