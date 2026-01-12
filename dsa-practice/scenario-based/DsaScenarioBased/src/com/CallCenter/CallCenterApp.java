package com.CallCenter;
import java.util.Scanner;

public class CallCenterApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CallCenterManager manager = new CallCenterManager();

        int choice;

        do {
            System.out.println("\n---- Call Center Management System ----");
            System.out.println("1. Add Incoming Call");
            System.out.println("2. Handle Next Call");
            System.out.println("3. Display Call Counts");
            System.out.println("4. Display Queues");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Customer ID: ");
                    String id = sc.nextLine();

                    System.out.print("Enter Customer Name: ");
                    String name = sc.nextLine();

                    System.out.print("Is VIP Customer? (true/false): ");
                    boolean isVIP = sc.nextBoolean();

                    Customer customer = new Customer(id, name, isVIP);
                    manager.addCall(customer);
                    break;

                case 2:
                    manager.handleNextCall();
                    break;

                case 3:
                    manager.displayCallCounts();
                    break;

                case 4:
                    manager.displayQueues();
                    break;

                case 5:
                    System.out.println("Exiting Call Center System.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}
