package com.HospitalPatientManagementSystem;

abstract class Patient {
    protected int patientId;
    protected String name;
    protected int age;
    private String medicalHistory;

    public Patient(int patientId, String name, int age, String medicalHistory) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.medicalHistory = medicalHistory;
    }

    public String getMedicalHistory() {
        return "Access Restricted";
    }

    public abstract void displayInfo();
}

