package com.objectmodelling;

import java.util.ArrayList;

public class EComCustomer {

    // Declaring customer name
    String customerName;

    // List to store customer orders
    ArrayList<Order> orders;

    // Parameterized constructor
    public EComCustomer(String customerName) {
        this.customerName = customerName;
        orders = new ArrayList<>();
    }

    // Method for customer to place an order
    public void placeOrder(Order order) {

        // Adding order to customer's order list
        orders.add(order);

        // Displaying confirmation message
        System.out.println("Order placed by " + customerName + " (Order ID: " + order.orderId + ")");
    }

    // Method to display customer orders
    public void displayOrders() {

        System.out.println("\nCustomer: " + customerName);
        System.out.println("Orders Placed:");

        for (Order order : orders) {
            order.displayOrder();
        }
    }
}

