package com.BookBazaar;
import java.util.Scanner;

public class BookBazaarApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("📚 Welcome to BookBazaar");

        // User Input
        System.out.print("Enter User ID: ");
        int uid = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String uname = sc.nextLine();

        User user = new User(uid, uname);

        // Book Inventory Setup
        System.out.print("\nEnter number of books in store: ");
        int n = sc.nextInt();
        sc.nextLine();

        Book[] inventory = new Book[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nBook " + (i + 1));
            System.out.print("Title: ");
            String title = sc.nextLine();

            System.out.print("Author: ");
            String author = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            System.out.print("Stock: ");
            int stock = sc.nextInt();

            System.out.println("Type: 1. EBook  2. PrintedBook");
            int type = sc.nextInt();
            sc.nextLine();

            if (type == 1) {
                inventory[i] = new EBook(title, author, price, stock);
            } else {
                inventory[i] = new PrintedBook(title, author, price, stock);
            }
        }

        Order order = new Order(user);

        int choice;
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. View Books");
            System.out.println("2. Add Book to Order");
            System.out.println("3. Place Order");
            System.out.println("4. View Order Details");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\n--- Book List ---");
                    for (int i = 0; i < inventory.length; i++) {
                        System.out.print((i + 1) + ". ");
                        inventory[i].showBook();
                    }
                    break;

                case 2:
                    System.out.print("Enter Book Number: ");
                    int bno = sc.nextInt() - 1;

                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();

                    order.addBook(inventory[bno], qty);
                    break;

                case 3:
                    double total = order.calculateTotal();
                    double discount = order.calculateDiscount();
                    double finalAmount = total - discount;

                    System.out.println("\nTotal: ₹" + total);
                    System.out.println("Discount: ₹" + discount);
                    System.out.println("Final Amount: ₹" + finalAmount);

                    order.placeOrder();
                    break;

                case 4:
                    order.showOrderDetails();
                    break;

                case 5:
                    System.out.println("Thank you for shopping at BookBazaar 📚");
                    break;

                default:
                    System.out.println("❌ Invalid choice");
            }

        } while (choice != 5);

        sc.close();
    }
}
