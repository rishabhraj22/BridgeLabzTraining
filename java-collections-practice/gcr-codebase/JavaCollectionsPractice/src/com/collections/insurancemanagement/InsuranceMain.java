package com.collections.insurancemanagement;
import java.time.LocalDate;
import java.util.*;

public class InsuranceMain {
    public static void main(String[] args) {

        PolicyManager manager = new PolicyManager();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of policies: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Policy Number: ");
            String num = sc.nextLine();

            System.out.print("Policy Holder: ");
            String holder = sc.nextLine();

            System.out.print("Expiry Date (yyyy-mm-dd): ");
            LocalDate date = LocalDate.parse(sc.nextLine());

            System.out.print("Coverage Type: ");
            String type = sc.nextLine();

            System.out.print("Premium: ");
            double premium = sc.nextDouble();
            sc.nextLine();

            manager.addPolicy(new Policy(num, holder, date, type, premium));
        }

        System.out.println("\n--- Expiring Soon ---");
        manager.expiringSoon();

        System.out.print("\nSearch by policy number: ");
        System.out.println(manager.getPolicyByNumber(sc.nextLine()));

        System.out.print("\nSearch by holder name: ");
        manager.policiesByHolder(sc.nextLine());

        System.out.println("\n--- Insertion Order ---");
        manager.showInsertionOrder();

        manager.removeExpired();
    }
}
