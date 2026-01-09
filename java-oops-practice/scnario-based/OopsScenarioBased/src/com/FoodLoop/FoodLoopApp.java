package com.FoodLoop;
import java.util.Scanner;

public class FoodLoopApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("🍔 Welcome to FoodLoop – Restaurant Ordering System");

        // Menu Setup
        System.out.print("Enter number of food items in menu: ");
        int n = sc.nextInt();
        sc.nextLine();

        FoodItem[] menu = new FoodItem[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nFood Item " + (i + 1));

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            System.out.print("Stock: ");
            int stock = sc.nextInt();

            System.out.println("Type: 1. Veg  2. Non-Veg");
            int type = sc.nextInt();
            sc.nextLine();

            if (type == 1) {
                menu[i] = new VegItem(name, price, stock);
            } else {
                menu[i] = new NonVegItem(name, price, stock);
            }
        }

        Order order = new Order();

        int choice;
        do {
            System.out.println("\n--- FoodLoop Menu ---");
            System.out.println("1. View Menu");
            System.out.println("2. Add Item to Order");
            System.out.println("3. Place Order");
            System.out.println("4. Cancel Order");
            System.out.println("5. View Order Details");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\n--- Food Menu ---");
                    for (int i = 0; i < menu.length; i++) {
                        System.out.print((i + 1) + ". ");
                        menu[i].showItem();
                    }
                    break;

                case 2:
                    System.out.print("Enter Item Number: ");
                    int ino = sc.nextInt() - 1;

                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();

                    order.addItem(menu[ino], qty);
                    break;

                case 3:
                    order.placeOrder();
                    break;

                case 4:
                    order.cancelOrder();
                    break;

                case 5:
                    order.showOrderDetails();
                    break;

                case 6:
                    System.out.println("Thank you for using FoodLoop 🍔");
                    break;

                default:
                    System.out.println("❌ Invalid choice");
            }

        } while (choice != 6);

        sc.close();
    }
}
