package com.annotationsandreflection.annotations.repeatableannotation;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {

        Method method = SoftwareModule.class.getMethod("process");

        BugReport[] bugs = method.getAnnotationsByType(BugReport.class);

        for (BugReport bug : bugs) {
            System.out.println("Bug: " + bug.description());
        }
    }
}
