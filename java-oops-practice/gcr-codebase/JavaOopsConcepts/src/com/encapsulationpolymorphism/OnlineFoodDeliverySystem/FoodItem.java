package com.encapsulationpolymorphism.OnlineFoodDeliverySystem;

public abstract class FoodItem {

    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Encapsulation: controlled access
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    protected int getQuantity() {
        return quantity;
    }

    protected double getBaseTotal() {
        return price * quantity;
    }

    // Abstract method
    public abstract double calculateTotalPrice();

    // Concrete method
    public void getItemDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }
}

