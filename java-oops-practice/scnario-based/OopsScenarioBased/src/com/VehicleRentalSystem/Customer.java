package com.VehicleRentalSystem;

class Customer {
    private int customerId;
    private String name;
    private Vehicle rentedVehicle;

    public Customer(int customerId, String name, Vehicle rentedVehicle) {
        this.customerId = customerId;
        this.name = name;
        this.rentedVehicle = rentedVehicle;
    }

    public void showRentalDetails(int days) {
        System.out.println("\nCustomer: " + name);
        rentedVehicle.displayDetails();
        System.out.println("Total Rent for " + days + " days: ₹" +
                rentedVehicle.calculateRent(days));
    }
}

