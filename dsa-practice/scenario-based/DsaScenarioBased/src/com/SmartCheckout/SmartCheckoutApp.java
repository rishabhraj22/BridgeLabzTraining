package com.SmartCheckout;
import java.util.Scanner;

public class SmartCheckoutApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CheckoutManager manager = new CheckoutManager();

        // Preload some inventory
        manager.addItemToInventory("Milk", 50, 20);
        manager.addItemToInventory("Bread", 30, 15);
        manager.addItemToInventory("Eggs", 6, 100);
        manager.addItemToInventory("Rice", 60, 25);

        int choice;

        do {
            System.out.println("\n---- Smart Checkout Menu ----");
            System.out.println("1. Display Inventory");
            System.out.println("2. Add Customer to Queue");
            System.out.println("3. Process Next Customer");
            System.out.println("4. Display Customer Queue");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    manager.displayInventory();
                    break;

                case 2:
                    System.out.print("Enter Customer Name: ");
                    String name = sc.nextLine();

                    Customer customer = new Customer(name);

                    int addMore;
                    do {
                        System.out.print("Enter Item Name: ");
                        String itemName = sc.nextLine();

                        System.out.print("Enter Quantity: ");
                        int qty = sc.nextInt();
                        sc.nextLine();

                        customer.addItemToCart(itemName, qty);

                        System.out.print("Add more items? (1 = Yes, 0 = No): ");
                        addMore = sc.nextInt();
                        sc.nextLine();

                    } while (addMore == 1);

                    manager.addCustomer(customer);
                    break;

                case 3:
                    manager.processNextCustomer();
                    break;

                case 4:
                    manager.displayQueue();
                    break;

                case 5:
                    System.out.println("Exiting Smart Checkout System.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}
