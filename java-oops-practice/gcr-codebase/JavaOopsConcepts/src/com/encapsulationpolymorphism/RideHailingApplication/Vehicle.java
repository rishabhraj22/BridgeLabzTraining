package com.encapsulationpolymorphism.RideHailingApplication;

public abstract class Vehicle {

    private String vehicleId;
    private String driverName;
    protected double ratePerKm;

    // Encapsulated location
    private String currentLocation = "Unknown";

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    // Encapsulation: getters only
    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    protected double getRatePerKm() {
        return ratePerKm;
    }

    // GPS helpers (controlled access)
    protected void setLocation(String location) {
        this.currentLocation = location;
    }

    protected String getLocation() {
        return currentLocation;
    }

    // Abstract method
    public abstract double calculateFare(double distance);

    // Concrete method
    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per Km: " + ratePerKm);
        System.out.println("Current Location: " + currentLocation);
    }
}

