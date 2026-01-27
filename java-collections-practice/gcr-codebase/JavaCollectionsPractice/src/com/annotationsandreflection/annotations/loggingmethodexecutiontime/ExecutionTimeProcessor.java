package com.annotationsandreflection.annotations.loggingmethodexecutiontime;

import java.lang.reflect.Method;

public class ExecutionTimeProcessor {

    public static void execute(Object obj) throws Exception {

        Class<?> cls = obj.getClass();

        for (Method method : cls.getDeclaredMethods()) {

            if (method.isAnnotationPresent(LogExecutionTime.class)) {

                long start = System.nanoTime();
                method.invoke(obj);
                long end = System.nanoTime();

                System.out.println(
                    method.getName() + " executed in " + (end - start) + " ns"
                );
            }
        }
    }
}
