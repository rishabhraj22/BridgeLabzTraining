package com.encapsulationpolymorphism.RideHailingApplication;

public class Auto extends Vehicle implements GPS {

    public Auto(String vehicleId, String driverName) {
        super(vehicleId, driverName, 10); // ₹10/km
    }

    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm + 20; // auto surcharge
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

