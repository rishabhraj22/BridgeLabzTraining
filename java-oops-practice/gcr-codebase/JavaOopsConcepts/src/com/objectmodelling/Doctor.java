package com.objectmodelling;

import java.util.ArrayList;

public class Doctor {

    // Declaring doctor attributes
    String doctorName;
    String specialization;

    // List to store patients consulted by doctor
    ArrayList<Patient> patients;

    // Parameterized constructor
    public Doctor(String doctorName, String specialization) {
        this.doctorName = doctorName;
        this.specialization = specialization;
        patients = new ArrayList<>();
    }

    // Method to consult a patient (communication)
    public void consult(Patient patient) {

        // Adding patient to doctor's list
        patients.add(patient);

        // Adding doctor to patient's list
        patient.addDoctor(this);

        // Displaying consultation details
        System.out.println("Doctor " + doctorName +
                           " is consulting Patient " + patient.patientName);
    }

    // Method to display patients consulted by doctor
    public void displayPatients() {

        System.out.println("\nDoctor: " + doctorName);
        System.out.println("Patients Consulted:");

        for (Patient patient : patients) {
            System.out.println(patient.patientName);
        }
    }
}

