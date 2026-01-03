package com.CabbyGo;

class SUV extends Vehicle {

    public SUV(String number) {
        super(number, 6, "SUV", 20);
    }

    @Override
    public double calculateFare(int distance) {
        double baseFare = 100;
        return baseFare + (distance * ratePerKm);
    }
}


