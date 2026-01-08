package com.MediStore;
abstract class Medicine implements ISellable {
    protected String name;
    protected String expiryDate; // format: dd-mm-yyyy
    private double price;        // sensitive
    private int quantity;        // sensitive stock

    public Medicine(String name, double price, String expiryDate) {
        this(name, price, expiryDate, 50); // default quantity
    }

    public Medicine(String name, double price, String expiryDate, int quantity) {
        this.name = name;
        this.price = price;
        this.expiryDate = expiryDate;
        this.quantity = quantity;
    }

    protected double getPrice() {
        return price;
    }

    protected int getQuantity() {
        return quantity;
    }

    protected void reduceStock(int qty) {
        quantity = Math.max(0, quantity - qty);
    }

    protected void increaseStock(int qty) {
        quantity += qty;
    }

    protected double calculateTotal(int qty) {
        return price * qty;
    }

    protected double applyDiscount(double total) {
        // flat 5% discount
        return total * 0.05;
    }

    public void showInfo() {
        System.out.println(name + " | Exp: " + expiryDate + " | Stock: " + quantity);
    }

    @Override
    public void sell(int qty) {
        if (qty <= quantity) {
            double total = calculateTotal(qty);
            double discount = applyDiscount(total);
            double finalAmount = total - discount;

            reduceStock(qty);

            System.out.println("Sold " + qty + " unit(s) of " + name);
            System.out.println("Total: ₹" + total);
            System.out.println("Discount: ₹" + discount);
            System.out.println("Payable: ₹" + finalAmount);
        } else {
            System.out.println("❌ Insufficient stock for " + name);
        }
    }

    @Override
    public abstract boolean checkExpiry();
}
