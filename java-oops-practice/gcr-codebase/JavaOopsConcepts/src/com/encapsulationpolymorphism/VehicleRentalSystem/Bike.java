package com.encapsulationpolymorphism.VehicleRentalSystem;

public class Bike extends Vehicle implements Insurable {

    public Bike(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Bike", rentalRate);
        setInsurancePolicyNumber(policyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    @Override
    public double calculateInsurance() {
        return 200;
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance | Policy: " + getMaskedPolicyNumber();
    }
}
