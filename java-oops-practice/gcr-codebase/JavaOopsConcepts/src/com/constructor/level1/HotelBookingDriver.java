package com.constructor.level1;

public class HotelBookingDriver {

    public static void main(String[] args) {

        // Creating booking using default constructor
        HotelBooking booking1 = new HotelBooking();
        booking1.displayBooking();

        System.out.println();

        // Creating booking using parameterized constructor
        HotelBooking booking2 = new HotelBooking("Raj", "Deluxe", 3);
        booking2.displayBooking();

        System.out.println();

        // Creating booking using copy constructor
        HotelBooking booking3 = new HotelBooking(booking2);
        booking3.displayBooking();
    }
}

