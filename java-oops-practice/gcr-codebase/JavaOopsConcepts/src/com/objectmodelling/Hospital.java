package com.objectmodelling;

import java.util.ArrayList;

public class Hospital {

    // Declaring hospital name
    String hospitalName;

    // Lists to store doctors and patients
    ArrayList<Doctor> doctors;
    ArrayList<Patient> patients;

    // Parameterized constructor
    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        doctors = new ArrayList<>();
        patients = new ArrayList<>();
    }

    // Method to add doctor to hospital
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    // Method to add patient to hospital
    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    // Method to display hospital details
    public void displayHospital() {

        System.out.println("Hospital Name: " + hospitalName);

        System.out.println("\nDoctors Available:");
        for (Doctor doctor : doctors) {
            System.out.println(doctor.doctorName);
        }

        System.out.println("\nPatients Registered:");
        for (Patient patient : patients) {
            System.out.println(patient.patientName);
        }
    }
}
