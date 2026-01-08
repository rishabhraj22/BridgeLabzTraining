package com.MediStore;
class Injection extends Medicine {

    public Injection(String name, double price, String expiryDate) {
        super(name, price, expiryDate);
    }

    public Injection(String name, double price, String expiryDate, int qty) {
        super(name, price, expiryDate, qty);
    }

    @Override
    public boolean checkExpiry() {
        System.out.println("Checking expiry for injectable medicine: " + name);
        return false; // simplified
    }
}
