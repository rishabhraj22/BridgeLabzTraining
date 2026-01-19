package com.FleetManager;
public class Vehicle {

    private String vehicleId;
    private int mileage; // in km

    public Vehicle(String vehicleId, int mileage) {
        this.vehicleId = vehicleId;
        this.mileage = mileage;
    }

    public int getMileage() {
        return mileage;
    }

    public void display() {
        System.out.println("Vehicle ID: " + vehicleId + ", Mileage: " + mileage + " km");
    }
}
