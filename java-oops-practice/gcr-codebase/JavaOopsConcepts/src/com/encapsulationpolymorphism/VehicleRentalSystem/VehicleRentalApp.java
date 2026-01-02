package com.encapsulationpolymorphism.VehicleRentalSystem;

import java.util.ArrayList;
import java.util.List;

public class VehicleRentalApp {

    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("KA01AB1234", 2000, "CAR998877"));
        vehicles.add(new Bike("MH12XY5678", 500, "BIKE556677"));
        vehicles.add(new Truck("DL09TR9999", 4000, "TRUCK112233"));

        int rentalDays = 3;

        for (Vehicle vehicle : vehicles) {

            vehicle.displayVehicleDetails();

            double rentalCost = vehicle.calculateRentalCost(rentalDays);
            double insuranceCost = 0;

            if (vehicle instanceof Insurable) {
                Insurable insurable = (Insurable) vehicle;
                insuranceCost = insurable.calculateInsurance();
                System.out.println(insurable.getInsuranceDetails());
            }

            System.out.println("Rental Cost (" + rentalDays + " days): " + rentalCost);
            System.out.println("Insurance Cost: " + insuranceCost);
            System.out.println("Total Cost: " + (rentalCost + insuranceCost));
            System.out.println("-----------------------------------");
        }
    }
}

