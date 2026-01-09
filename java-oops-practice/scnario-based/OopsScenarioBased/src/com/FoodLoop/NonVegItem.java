package com.FoodLoop;
class NonVegItem extends FoodItem {

    public NonVegItem(String name, double price, int stock) {
        super(name, "Non-Veg", price, stock);
    }

    @Override
    public double applyDiscount(double total) {
        return total * 0.05; // 5% discount on non-veg
    }
}
