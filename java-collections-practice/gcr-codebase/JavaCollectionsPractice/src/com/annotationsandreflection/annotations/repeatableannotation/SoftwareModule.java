package com.annotationsandreflection.annotations.repeatableannotation;

public class SoftwareModule {

    @BugReport(description = "Null pointer issue")
    @BugReport(description = "Performance slow on login")
    public void process() {
        System.out.println("Processing module...");
    }
}
