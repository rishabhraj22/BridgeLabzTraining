package com.PayXpress;
import java.util.Scanner;

public class PayXpressApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("💳 Welcome to PayXpress – Utility Bill Payment System");

        System.out.print("Enter number of bills to add: ");
        int n = sc.nextInt();
        sc.nextLine();

        Bill[] bills = new Bill[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nBill " + (i + 1));
            System.out.println("1. Electricity");
            System.out.println("2. Water");
            System.out.println("3. Internet");
            System.out.print("Select Bill Type: ");
            int type = sc.nextInt();

            System.out.print("Enter Amount: ");
            double amount = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter Due Date (dd-mm-yyyy): ");
            String due = sc.nextLine();

            System.out.print("Is this a recurring bill? (yes/no): ");
            String rec = sc.nextLine();

            boolean recurring = rec.equalsIgnoreCase("yes");

            switch (type) {
                case 1:
                    bills[i] = new ElectricityBill(amount, due, recurring);
                    break;
                case 2:
                    bills[i] = new WaterBill(amount, due, recurring);
                    break;
                case 3:
                    bills[i] = new InternetBill(amount, due, recurring);
                    break;
                default:
                    System.out.println("Invalid choice, defaulting to Electricity");
                    bills[i] = new ElectricityBill(amount, due, recurring);
            }
        }

        int choice;
        do {
            System.out.println("\n--- PayXpress Menu ---");
            System.out.println("1. View Bills");
            System.out.println("2. Pay Bill");
            System.out.println("3. Send Reminder");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\n--- Your Bills ---");
                    for (int i = 0; i < bills.length; i++) {
                        System.out.print((i + 1) + ". ");
                        bills[i].showBill();
                    }
                    break;

                case 2:
                    System.out.print("Enter Bill Number to Pay: ");
                    int pno = sc.nextInt() - 1;
                    bills[pno].pay();
                    break;

                case 3:
                    System.out.print("Enter Bill Number for Reminder: ");
                    int rno = sc.nextInt() - 1;
                    bills[rno].sendReminder();
                    break;

                case 4:
                    System.out.println("Thank you for using PayXpress 💳");
                    break;

                default:
                    System.out.println("❌ Invalid choice");
            }

        } while (choice != 4);

        sc.close();
    }
}
