package com.FoodLoop;
abstract class FoodItem {
    protected String name;
    protected String category;
    protected double price;
    private int stock; // hidden stock

    public FoodItem(String name, String category, double price, int stock) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
    }

    public boolean reduceStock(int qty) {
        if (qty <= stock) {
            stock -= qty;
            return true;
        }
        return false;
    }

    public int getStock() {
        return stock;
    }

    public abstract double applyDiscount(double total);

    public void showItem() {
        System.out.println(name + " | " + category + " | ₹" + price + " | Stock: " + stock);
    }
}
