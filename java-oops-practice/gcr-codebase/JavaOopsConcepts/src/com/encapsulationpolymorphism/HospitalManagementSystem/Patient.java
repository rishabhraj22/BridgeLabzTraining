package com.encapsulationpolymorphism.HospitalManagementSystem;

import java.util.ArrayList;
import java.util.List;

public abstract class Patient {

    private int patientId;
    private String name;
    private int age;

    // Sensitive data (encapsulation)
    private String diagnosis;
    private List<String> medicalHistory = new ArrayList<>();

    public Patient(int patientId, String name, int age, String diagnosis) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    // Encapsulation: getters only (no direct modification)
    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    protected void addMedicalHistory(String record) {
        medicalHistory.add(record);
    }

    protected List<String> getMedicalHistory() {
        return medicalHistory;
    }

    protected String getDiagnosis() {
        return diagnosis;
    }

    // Abstract method
    public abstract double calculateBill();

    // Concrete method
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

