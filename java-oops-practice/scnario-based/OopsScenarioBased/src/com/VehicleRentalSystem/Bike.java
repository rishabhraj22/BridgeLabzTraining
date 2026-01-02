package com.VehicleRentalSystem;

class Bike extends Vehicle {

    public Bike(int id, String brand, double rate) {
        super(id, brand, rate);
    }

    @Override
    public double calculateRent(int days) {
        return baseRate * days;
    }

    @Override
    public void displayDetails() {
        System.out.println("Bike | Brand: " + brand + " | Rate: ₹" + baseRate);
    }
}

