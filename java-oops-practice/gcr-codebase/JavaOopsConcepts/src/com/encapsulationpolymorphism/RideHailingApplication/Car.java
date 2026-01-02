package com.encapsulationpolymorphism.RideHailingApplication;

public class Car extends Vehicle implements GPS {

    public Car(String vehicleId, String driverName) {
        super(vehicleId, driverName, 15); // ₹15/km
    }

    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm + 50; // base charge
    }

    @Override
    public String getCurrentLocation() {
        return getLocation();
    }

    @Override
    public void updateLocation(String newLocation) {
        setLocation(newLocation);
    }
}

