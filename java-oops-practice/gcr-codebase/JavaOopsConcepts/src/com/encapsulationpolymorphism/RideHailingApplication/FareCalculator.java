package com.encapsulationpolymorphism.RideHailingApplication;

import java.util.List;

public class FareCalculator {

    public static void calculateFareForRide(List<Vehicle> vehicles, double distance) {

        for (Vehicle vehicle : vehicles) {

            vehicle.getVehicleDetails();

            double fare = vehicle.calculateFare(distance);
            System.out.println("Distance: " + distance + " km");
            System.out.println("Calculated Fare: ₹" + fare);
            System.out.println("--------------------------------");
        }
    }
}

