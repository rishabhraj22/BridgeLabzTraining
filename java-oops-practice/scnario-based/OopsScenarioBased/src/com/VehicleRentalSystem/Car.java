package com.VehicleRentalSystem;

class Car extends Vehicle {

    public Car(int id, String brand, double rate) {
        super(id, brand, rate);
    }

    @Override
    public double calculateRent(int days) {
        double luxuryCharge = 500;
        return (baseRate * days) + luxuryCharge;
    }

    @Override
    public void displayDetails() {
        System.out.println("Car | Brand: " + brand + " | Rate: ₹" + baseRate);
    }
}
