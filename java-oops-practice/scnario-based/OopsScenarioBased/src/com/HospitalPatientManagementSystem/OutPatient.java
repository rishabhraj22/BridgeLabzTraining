package com.HospitalPatientManagementSystem;

class OutPatient extends Patient {
    private int consultationFee;

    public OutPatient(int id, String name, int age, String history, int fee) {
        super(id, name, age, history);
        this.consultationFee = fee;
    }

    @Override
    public void displayInfo() {
        System.out.println("OutPatient: " + name + " | Fee: " + consultationFee);
    }

    public int getConsultationFee() {
        return consultationFee;
    }
}

