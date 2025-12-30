package com.objectmodelling;

public class HospitalDriver {

    public static void main(String[] args) {

        // Creating Hospital object
        Hospital hospital = new Hospital("City Care Hospital");

        // Creating Doctor objects
        Doctor d1 = new Doctor("Dr. Sharma", "Cardiology");
        Doctor d2 = new Doctor("Dr. Mehta", "Neurology");

        // Creating Patient objects
        Patient p1 = new Patient("Ravi", 45);
        Patient p2 = new Patient("Neha", 30);

        // Adding doctors and patients to hospital
        hospital.addDoctor(d1);
        hospital.addDoctor(d2);

        hospital.addPatient(p1);
        hospital.addPatient(p2);

        // Displaying hospital details
        hospital.displayHospital();

        // Doctor-patient consultations (association + communication)
        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p1);

        // Displaying consultation summaries
        d1.displayPatients();
        d2.displayPatients();

        p1.displayDoctors();
        p2.displayDoctors();
    }
}

