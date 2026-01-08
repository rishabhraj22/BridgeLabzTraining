package com.MediStore;
class Syrup extends Medicine {

    public Syrup(String name, double price, String expiryDate) {
        super(name, price, expiryDate);
    }

    public Syrup(String name, double price, String expiryDate, int qty) {
        super(name, price, expiryDate, qty);
    }

    @Override
    public boolean checkExpiry() {
        // Liquid medicines spoil faster
        System.out.println("Checking expiry for liquid syrup: " + name);
        return false; // simplified
    }
}
