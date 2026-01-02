package com.HospitalPatientManagementSystem;

public class HospitalApp {
    public static void main(String[] args) {

        Patient p1 = new InPatient(101, "Ramesh", 65, "Diabetes", 5000, true);
        Patient p2 = new OutPatient(102, "Anita", 30, "Fever", 800);

        Doctor d1 = new Doctor(1, "Dr. Sharma", "Cardiology");

        p1.displayInfo();
        p2.displayInfo();
        d1.displayInfo();

        Bill bill1 = new Bill(p1);
        Bill bill2 = new Bill(p2);

        System.out.println("Bill Amount: ₹" + bill1.calculatePayment());
        System.out.println("Bill Amount: ₹" + bill2.calculatePayment());
    }
}

