package com.encapsulationpolymorphism.RideHailingApplication;

import java.util.ArrayList;
import java.util.List;

public class RideHailingApp {

    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();

        Vehicle car = new Car("CAR101", "Rohit");
        Vehicle bike = new Bike("BIKE202", "Aman");
        Vehicle auto = new Auto("AUTO303", "Suresh");

        ((GPS) car).updateLocation("MG Road");
        ((GPS) bike).updateLocation("Indiranagar");
        ((GPS) auto).updateLocation("Whitefield");

        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(auto);

        FareCalculator.calculateFareForRide(vehicles, 10);
    }
}

