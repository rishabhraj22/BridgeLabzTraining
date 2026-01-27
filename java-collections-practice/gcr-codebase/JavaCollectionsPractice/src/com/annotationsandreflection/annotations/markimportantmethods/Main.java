package com.annotationsandreflection.annotations.markimportantmethods;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

        Class<Service> cls = Service.class;

        for (Method method : cls.getDeclaredMethods()) {
            if (method.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod imp = method.getAnnotation(ImportantMethod.class);
                System.out.println("Method: " + method.getName());
                System.out.println("Level: " + imp.level());
                System.out.println("---------------------");
            }
        }
    }
}
