package com.objectmodelling;

import java.util.ArrayList;

public class Patient {

    // Declaring patient attributes
    String patientName;
    int age;

    // List to store doctors consulted by patient
    ArrayList<Doctor> doctors;

    // Parameterized constructor
    public Patient(String patientName, int age) {
        this.patientName = patientName;
        this.age = age;
        doctors = new ArrayList<>();
    }

    // Method to add doctor to patient's list
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    // Method to display doctors consulted by patient
    public void displayDoctors() {

        System.out.println("\nPatient: " + patientName);
        System.out.println("Doctors Consulted:");

        for (Doctor doctor : doctors) {
            System.out.println(doctor.doctorName);
        }
    }
}

