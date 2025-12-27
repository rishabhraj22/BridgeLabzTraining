package com.constructor.level1;

public class CarRentalDriver {

    public static void main(String[] args) {

        // Creating rental using default constructor
        CarRental rental1 = new CarRental();
        rental1.displayRental();

        System.out.println();

        // Creating rental using parameterized constructor
        CarRental rental2 = new CarRental("Amit", "SUV", 5);
        rental2.displayRental();
    }
}

