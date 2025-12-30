package com.objectmodelling;

import java.util.ArrayList;

public class Order {

    // Declaring order id
    int orderId;

    // Order has Product objects
    ArrayList<Product> products;

    // Parameterized constructor
    public Order(int orderId) {
        this.orderId = orderId;
        products = new ArrayList<>();
    }

    // Method to add product to order
    public void addProduct(Product product) {
        products.add(product);
    }

    // Method to calculate total order amount
    public double calculateTotal() {

        double total = 0;

        // Looping through products to calculate total
        for (Product product : products) {
            total = total + product.price;
        }

        return total;
    }

    // Method to display order details
    public void displayOrder() {

        System.out.println("\nOrder ID: " + orderId);
        System.out.println("Products in Order:");

        for (Product product : products) {
            product.displayProduct();
            System.out.println();
        }

        System.out.println("Total Amount: ₹" + calculateTotal());
    }
}

