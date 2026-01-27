package com.annotationsandreflection.annotations.todoannotation;

public class ProjectFeatures {

    @Todo(
        task = "Implement login validation",
        assignedTo = "Rishabh",
        priority = "HIGH"
    )
    public void loginFeature() {
    }

    @Todo(
        task = "Add forgot password flow",
        assignedTo = "Ankit"
    )
    public void forgotPassword() {
    }

    @Todo(
        task = "Optimize database queries",
        assignedTo = "Neha",
        priority = "LOW"
    )
    public void optimizeDB() {
    }
}
