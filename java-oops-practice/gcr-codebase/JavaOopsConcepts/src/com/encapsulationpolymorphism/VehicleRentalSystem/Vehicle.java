package com.encapsulationpolymorphism.VehicleRentalSystem;

public abstract class Vehicle {

    private String vehicleNumber;
    private String type;
    protected double rentalRate; // per day

    // Sensitive field (encapsulation)
    private String insurancePolicyNumber;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    // Encapsulation: getters & setters
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        if (vehicleNumber == null || vehicleNumber.isBlank()) {
            throw new IllegalArgumentException("Vehicle number cannot be empty");
        }
        this.vehicleNumber = vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    // Sensitive data access (controlled)
    protected void setInsurancePolicyNumber(String policyNumber) {
        this.insurancePolicyNumber = policyNumber;
    }

    protected String getMaskedPolicyNumber() {
        if (insurancePolicyNumber == null) return "Not Assigned";
        return "XXXX-" + insurancePolicyNumber.substring(insurancePolicyNumber.length() - 4);
    }

    // Abstract method
    public abstract double calculateRentalCost(int days);

    // Common display method
    public void displayVehicleDetails() {
        System.out.println("Vehicle No: " + vehicleNumber);
        System.out.println("Type: " + type);
        System.out.println("Rental Rate (per day): " + rentalRate);
    }
}

