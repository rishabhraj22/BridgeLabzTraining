package com.streamapi.doctoravailability;
import java.util.*;
import java.util.stream.*;

class HospitalDoctorAvailability {

    static class Doctor {
        String name;
        String specialty;
        boolean availableOnWeekend;

        Doctor(String name, String specialty, boolean availableOnWeekend) {
            this.name = name;
            this.specialty = specialty;
            this.availableOnWeekend = availableOnWeekend;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of doctors: ");
        int n = sc.nextInt();
        sc.nextLine();

        List<Doctor> doctors = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter doctor name: ");
            String name = sc.nextLine();
            System.out.print("Enter specialty: ");
            String specialty = sc.nextLine();
            System.out.print("Available on weekend? (true/false): ");
            boolean available = sc.nextBoolean();
            sc.nextLine();

            doctors.add(new Doctor(name, specialty, available));
        }

        System.out.println("\nDoctors available on weekends (sorted by specialty):");

        doctors.stream()
                .filter(d -> d.availableOnWeekend)
                .sorted(Comparator.comparing(d -> d.specialty))
                .forEach(d -> System.out.println(d.name + " | " + d.specialty));
    }
}
