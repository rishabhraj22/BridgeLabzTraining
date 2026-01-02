package com.HospitalPatientManagementSystem;

class InPatient extends Patient {
    private int roomCharges;
    private boolean emergency;

    public InPatient(int id, String name, int age, String history,
                     int roomCharges, boolean emergency) {
        super(id, name, age, history);
        this.roomCharges = roomCharges;
        this.emergency = emergency;
    }

    @Override
    public void displayInfo() {
        System.out.println("InPatient: " + name + " | Room Charges: " + roomCharges);
    }

    public int getRoomCharges() {
        return roomCharges + (emergency ? 2000 : 0);
    }
}

