package com.MediStore;
class Tablet extends Medicine {

    public Tablet(String name, double price, String expiryDate) {
        super(name, price, expiryDate);
    }

    public Tablet(String name, double price, String expiryDate, int qty) {
        super(name, price, expiryDate, qty);
    }

    @Override
    public boolean checkExpiry() {
        // Preserved medicines – normal expiry check
        System.out.println("Checking expiry for preserved tablet: " + name);
        return false; // simplified (assume not expired)
    }
}
