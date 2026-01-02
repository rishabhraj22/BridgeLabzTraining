package com.encapsulationpolymorphism.HospitalManagementSystem;

public class InPatient extends Patient implements MedicalRecord {

    private int daysAdmitted;
    private double dailyCharge;

    public InPatient(int patientId, String name, int age, String diagnosis,
                     int daysAdmitted, double dailyCharge) {
        super(patientId, name, age, diagnosis);
        this.daysAdmitted = daysAdmitted;
        this.dailyCharge = dailyCharge;
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * dailyCharge + 2000; // room + service charges
    }

    @Override
    public void addRecord(String record) {
        addMedicalHistory(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records (In-Patient): " + getMedicalHistory());
    }
}

