package com.CabbyGo;

class Sedan extends Vehicle {

    public Sedan(String number) {
        super(number, 4, "Sedan", 15);
    }

    @Override
    public double calculateFare(int distance) {
        double baseFare = 70;
        return baseFare + (distance * ratePerKm);
    }
}

