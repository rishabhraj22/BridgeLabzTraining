package com.constructor.level1;

public class Product {

    // Instance variables
    String productName;
    double price;

    // Class variable to count total products
    static int totalProducts = 0;

    // Parameterized constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;

        // Incrementing total products count
        totalProducts++;
    }

    // Instance method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }

    // Class method to display total products
    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }
}

