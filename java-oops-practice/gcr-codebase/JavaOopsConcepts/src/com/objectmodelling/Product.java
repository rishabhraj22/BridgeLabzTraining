package com.objectmodelling;

public class Product {

    // Declaring product attributes
    String productName;
    double price;

    // Parameterized constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    // Method to display product details
    public void displayProduct() {
        System.out.println("Product: " + productName);
        System.out.println("Price: ₹" + price);
    }
}

