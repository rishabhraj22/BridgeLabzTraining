package com.FoodLoop;
class VegItem extends FoodItem {

    public VegItem(String name, double price, int stock) {
        super(name, "Veg", price, stock);
    }

    @Override
    public double applyDiscount(double total) {
        return total * 0.10; // 10% discount on veg
    }
}
