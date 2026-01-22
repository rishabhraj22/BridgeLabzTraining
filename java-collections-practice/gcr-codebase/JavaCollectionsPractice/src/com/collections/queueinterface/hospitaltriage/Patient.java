package com.collections.queueinterface.hospitaltriage;
public class Patient {
    private String name;
    private int severity; // higher = more critical

    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    public String getName() {
        return name;
    }

    public int getSeverity() {
        return severity;
    }

    @Override
    public String toString() {
        return name + " (Severity " + severity + ")";
    }
}
