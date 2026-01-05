package com.SwiftCart;
import java.util.Scanner;

public class SwiftCartApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Cart cart = new Cart();

        System.out.println("🛒 Welcome to SwiftCart");

        System.out.print("Enter number of products to add: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("\nProduct " + (i + 1));
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            System.out.print("Quantity: ");
            int qty = sc.nextInt();

            System.out.println("Type: 1. Perishable  2. Non-Perishable");
            int type = sc.nextInt();
            sc.nextLine();

            Product product;
            if (type == 1) {
                product = new PerishableProduct(name, price);
            } else {
                product = new NonPerishableProduct(name, price);
            }

            cart.addProduct(product, qty);
        }

        cart.showCart();
        cart.applyDiscount();

        System.out.println("\nFinal Bill Amount: ₹" + cart.generateBill());

        sc.close();
    }
}
