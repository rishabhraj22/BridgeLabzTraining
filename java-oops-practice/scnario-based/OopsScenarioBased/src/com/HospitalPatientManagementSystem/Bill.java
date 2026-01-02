package com.HospitalPatientManagementSystem;

class Bill implements Payable {
    private Patient patient;
    private double gst = 0.18;

    public Bill(Patient patient) {
        this.patient = patient;
    }

    @Override
    public double calculatePayment() {
        double amount = 0;

        if (patient instanceof InPatient) {
            amount = ((InPatient) patient).getRoomCharges();
        } else if (patient instanceof OutPatient) {
            amount = ((OutPatient) patient).getConsultationFee();
        }

        if (patient.age >= 60) {
            amount -= amount * 0.10; // 10% senior discount
        }

        amount += amount * gst;
        return amount;
    }
}

