package com.ParkEase;
class Truck extends Vehicle {

    public Truck(String vehicleNumber) {
        super(vehicleNumber, "Truck");
    }

    @Override
    public double calculateCharges(int hours) {
        double baseRate = 100;
        double penalty = hours > 5 ? 200 : 0;
        return (baseRate * hours) + penalty;
    }
}
