package com.MediStore;
import java.util.Scanner;

public class MediStoreApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("💊 Welcome to MediStore – Pharmacy System");

        System.out.print("Enter number of medicines to add: ");
        int n = sc.nextInt();
        sc.nextLine();

        Medicine[] inventory = new Medicine[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nMedicine " + (i + 1));
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();
            sc.nextLine();

            System.out.print("Expiry Date (dd-mm-yyyy): ");
            String exp = sc.nextLine();

            System.out.print("Do you want to set custom quantity? (yes/no): ");
            String opt = sc.nextLine();

            int qty = 50;
            if (opt.equalsIgnoreCase("yes")) {
                System.out.print("Enter Quantity: ");
                qty = sc.nextInt();
                sc.nextLine();
            }

            System.out.println("Type: 1. Tablet  2. Syrup  3. Injection");
            System.out.print("Enter choice: ");
            int type = sc.nextInt();
            sc.nextLine();

            if (type == 1) {
                inventory[i] = new Tablet(name, price, exp, qty);
            } else if (type == 2) {
                inventory[i] = new Syrup(name, price, exp, qty);
            } else {
                inventory[i] = new Injection(name, price, exp, qty);
            }
        }

        int choice;
        do {
            System.out.println("\n--- MediStore Menu ---");
            System.out.println("1. View Inventory");
            System.out.println("2. Sell Medicine");
            System.out.println("3. Check Expiry");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("\n--- Inventory ---");
                    for (int i = 0; i < inventory.length; i++) {
                        System.out.print((i + 1) + ". ");
                        inventory[i].showInfo();
                    }
                    break;

                case 2:
                    System.out.print("Enter Medicine Number: ");
                    int mno = sc.nextInt() - 1;

                    System.out.print("Enter Quantity to Sell: ");
                    int sellQty = sc.nextInt();
                    sc.nextLine();

                    inventory[mno].sell(sellQty);
                    break;

                case 3:
                    System.out.print("Enter Medicine Number: ");
                    int eno = sc.nextInt() - 1;
                    sc.nextLine();

                    boolean expired = inventory[eno].checkExpiry();
                    if (expired) {
                        System.out.println("⚠️ Medicine is expired!");
                    } else {
                        System.out.println("✅ Medicine is safe to use.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using MediStore 💊");
                    break;

                default:
                    System.out.println("❌ Invalid option");
            }

        } while (choice != 4);

        sc.close();
    }
}
