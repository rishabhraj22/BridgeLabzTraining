package com.collections.insurancesystem;
import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        PolicyManager manager = new PolicyManager();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of policies: ");
        int n = sc.nextInt();
        sc.nextLine();

        List<Policy> allPolicies = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter policy details:");

            System.out.print("Policy Number: ");
            String num = sc.nextLine();

            System.out.print("Policy Holder Name: ");
            String name = sc.nextLine();

            System.out.print("Expiry Date (yyyy-mm-dd): ");
            LocalDate date = LocalDate.parse(sc.nextLine());

            System.out.print("Coverage Type: ");
            String type = sc.nextLine();

            System.out.print("Premium Amount: ");
            double premium = sc.nextDouble();
            sc.nextLine();

            Policy p = new Policy(num, name, date, type, premium);
            allPolicies.add(p);
            manager.addPolicy(p);
        }

        System.out.println("\n--- All Policies ---");
        manager.displayAllPolicies();

        System.out.println("\n--- Expiring in 30 days ---");
        manager.policiesExpiringSoon();

        System.out.print("\nEnter coverage type to search: ");
        String type = sc.nextLine();
        manager.policiesByCoverage(type);

        System.out.println("\n--- Duplicate Policies ---");
        manager.findDuplicates(allPolicies);

        System.out.println("\n--- Performance Comparison ---");
        manager.performanceTest();
    }
}
