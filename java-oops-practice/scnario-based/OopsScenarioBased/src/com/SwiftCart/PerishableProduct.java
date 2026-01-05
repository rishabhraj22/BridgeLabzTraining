package com.SwiftCart;
class PerishableProduct extends Product {

    public PerishableProduct(String name, double price) {
        super(name, price, "Perishable");
    }

    @Override
    public double getDiscount(double total) {
        return total * 0.10; // 10% discount
    }
}
