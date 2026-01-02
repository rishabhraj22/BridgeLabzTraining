package com.VehicleRentalSystem;

public class VehicleRentalApp {
    public static void main(String[] args) {

        Vehicle bike = new Bike(101, "Hero", 300);
        Vehicle car = new Car(201, "Hyundai", 1500);
        Vehicle truck = new Truck(301, "Tata", 2500);

        Customer c1 = new Customer(1, "Rohit", bike);
        Customer c2 = new Customer(2, "Anjali", car);
        Customer c3 = new Customer(3, "Mahesh", truck);

        c1.showRentalDetails(3);
        c2.showRentalDetails(2);
        c3.showRentalDetails(5);
    }
}

