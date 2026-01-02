package com.VehicleRentalSystem;

class Truck extends Vehicle {

    public Truck(int id, String brand, double rate) {
        super(id, brand, rate);
    }

    @Override
    public double calculateRent(int days) {
        double loadCharge = 1000;
        return (baseRate * days) + loadCharge;
    }

    @Override
    public void displayDetails() {
        System.out.println("Truck | Brand: " + brand + " | Rate: ₹" + baseRate);
    }
}

