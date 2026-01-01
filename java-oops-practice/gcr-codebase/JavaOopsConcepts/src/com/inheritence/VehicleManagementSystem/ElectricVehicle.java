package com.inheritence.VehicleManagementSystem;

class ElectricVehicle extends Vehicle {

    ElectricVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    void charge() {
        System.out.println("Electric vehicle is charging...");
    }
}

