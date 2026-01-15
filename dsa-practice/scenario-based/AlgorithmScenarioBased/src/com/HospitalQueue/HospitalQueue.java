package com.HospitalQueue;
import java.util.Scanner;

public class HospitalQueue {

    // Bubble Sort based on Criticality (Descending: High critical first)
    public static void bubbleSort(Patient[] patients) {
        int n = patients.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {

                // If current patient is less critical than next, swap
                if (patients[j].getCriticality() < patients[j + 1].getCriticality()) {
                    Patient temp = patients[j];
                    patients[j] = patients[j + 1];
                    patients[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of patients in ER: ");
        int n = sc.nextInt();

        Patient[] patients = new Patient[n];

        System.out.println("Enter patient details:");

        for (int i = 0; i < n; i++) {
            System.out.println("\nPatient " + (i + 1));

            System.out.print("Enter ID: ");
            int id = sc.nextInt();

            sc.nextLine(); // clear buffer

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Criticality (1-10): ");
            int criticality = sc.nextInt();

            patients[i] = new Patient(id, name, criticality);
        }

        // Sorting by criticality
        bubbleSort(patients);

        System.out.println("\nPatients sorted by Criticality (High to Low):");
        for (Patient p : patients) {
            p.display();
        }
    }
}
