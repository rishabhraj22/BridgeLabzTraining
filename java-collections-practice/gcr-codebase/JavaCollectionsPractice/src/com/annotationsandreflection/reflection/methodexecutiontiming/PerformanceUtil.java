package com.annotationsandreflection.reflection.methodexecutiontiming;

import java.lang.reflect.Method;

public class PerformanceUtil {

    public static void measure(Object obj) throws Exception {

        Class<?> cls = obj.getClass();

        for (Method m : cls.getDeclaredMethods()) {

            long start = System.nanoTime();
            m.invoke(obj);
            long end = System.nanoTime();

            System.out.println(
                m.getName() + " took " + (end - start) + " ns"
            );
        }
    }
}
