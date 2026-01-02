package com.encapsulationpolymorphism.VehicleRentalSystem;

public class Truck extends Vehicle implements Insurable {

    public Truck(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        setInsurancePolicyNumber(policyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        return (rentalRate * days) + 1000; // heavy vehicle surcharge
    }

    @Override
    public double calculateInsurance() {
        return 1500;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance | Policy: " + getMaskedPolicyNumber();
    }
}

