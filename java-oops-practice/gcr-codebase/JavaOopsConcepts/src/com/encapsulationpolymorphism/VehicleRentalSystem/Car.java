package com.encapsulationpolymorphism.VehicleRentalSystem;

public class Car extends Vehicle implements Insurable {

    public Car(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        setInsurancePolicyNumber(policyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    @Override
    public double calculateInsurance() {
        return 500; // flat insurance
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance | Policy: " + getMaskedPolicyNumber();
    }
}

