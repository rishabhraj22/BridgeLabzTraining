package com.CabbyGo;

public class CabbyGoApp {
    public static void main(String[] args) {

        Vehicle v1 = new Mini("MP09-AA-1234");
        Vehicle v2 = new SUV("DL01-BB-5678");

        Driver d1 = new Driver("Ramesh", "LIC12345", 4.7);

        IRideService ride1 = new RideService(v1, d1);
        IRideService ride2 = new RideService(v2, d1);

        ride1.bookRide(10);
        ride1.endRide();

        System.out.println();

        ride2.bookRide(8);
        ride2.endRide();
    }
}

