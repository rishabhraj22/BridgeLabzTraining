package com.collections.queueinterface.hospitaltriage;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HospitalTriageSystem system = new HospitalTriageSystem();

        System.out.print("Enter number of patients: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter patient name: ");
            String name = sc.nextLine();

            System.out.print("Enter severity (1-10): ");
            int severity = sc.nextInt();
            sc.nextLine();

            system.addPatient(new Patient(name, severity));
        }

        system.treatPatients();
    }
}
