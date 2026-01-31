package com.lambdaexpression.patientid;
import java.util.*;

public class HospitalAdminMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Patient> patients = new ArrayList<>();

        System.out.print("Enter number of patients: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter patient ID: ");
            patients.add(new Patient(sc.nextInt()));
        }

        System.out.println("\nPatient IDs for verification:");
        patients.stream()
                .map(Patient::getId)
                .forEach(System.out::println);   // method reference

        sc.close();
    }
}
