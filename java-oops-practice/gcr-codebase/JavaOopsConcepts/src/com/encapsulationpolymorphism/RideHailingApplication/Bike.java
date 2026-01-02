package com.encapsulationpolymorphism.RideHailingApplication;

public class Bike extends Vehicle implements GPS {

    public Bike(String vehicleId, String driverName) {
        super(vehicleId, driverName, 8); // ₹8/km
    }

    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm; // no base charge
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

