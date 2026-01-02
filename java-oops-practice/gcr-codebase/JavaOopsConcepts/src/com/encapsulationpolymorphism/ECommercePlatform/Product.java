package com.encapsulationpolymorphism.ECommercePlatform;

public abstract class Product {

    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Encapsulation: Getters & Setters
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        if (productId <= 0) {
            throw new IllegalArgumentException("Product ID must be positive");
        }
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.price = price;
    }

    // Abstract method
    public abstract double calculateDiscount();
}

