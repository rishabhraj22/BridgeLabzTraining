package com.encapsulationpolymorphism.HospitalManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class HospitalApp {

    public static void main(String[] args) {

        List<Patient> patients = new ArrayList<>();

        Patient p1 = new InPatient(
                101, "Rohit", 45, "Pneumonia", 5, 3000
        );

        Patient p2 = new OutPatient(
                102, "Aman", 30, "Fever", 500, 1200
        );

        patients.add(p1);
        patients.add(p2);

        for (Patient patient : patients) {

            patient.getPatientDetails();

            double bill = patient.calculateBill();
            System.out.println("Total Bill: " + bill);

            if (patient instanceof MedicalRecord) {
                MedicalRecord record = (MedicalRecord) patient;
                record.addRecord("Initial diagnosis completed");
                record.viewRecords();
            }

            System.out.println("----------------------------------");
        }
    }
}


