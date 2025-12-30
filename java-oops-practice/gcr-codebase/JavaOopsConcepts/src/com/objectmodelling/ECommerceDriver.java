package com.objectmodelling;

public class ECommerceDriver {

    public static void main(String[] args) {

        // Creating Product objects
        Product p1 = new Product("Laptop", 55000);
        Product p2 = new Product("Headphones", 2500);
        Product p3 = new Product("Mouse", 800);

        // Creating Order objects
        Order order1 = new Order(101);
        Order order2 = new Order(102);

        // Adding products to orders
        order1.addProduct(p1);
        order1.addProduct(p2);

        order2.addProduct(p3);

        // Creating Customer object
        EComCustomer customer = new EComCustomer("Rishabh");

        // Customer placing orders
        customer.placeOrder(order1);
        customer.placeOrder(order2);

        // Displaying customer order details
        customer.displayOrders();
    }
}

