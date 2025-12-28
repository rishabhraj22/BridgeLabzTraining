package com.constructor.level1;

public class VehicleDriver {

    public static void main(String[] args) {

        // Creating vehicle objects
        Vehicle v1 = new Vehicle("Ravi", "Car");
        Vehicle v2 = new Vehicle("Amit", "Bike");

        // Displaying vehicle details
        v1.displayVehicleDetails();
        System.out.println();
        v2.displayVehicleDetails();

        System.out.println();

        // Updating registration fee
        Vehicle.updateRegistrationFee(6500);

        // Displaying updated vehicle details
        v1.displayVehicleDetails();
    }
}

