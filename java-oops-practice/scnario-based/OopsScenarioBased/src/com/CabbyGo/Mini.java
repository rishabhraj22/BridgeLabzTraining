package com.CabbyGo;

class Mini extends Vehicle {

    public Mini(String number) {
        super(number, 4, "Mini", 10);
    }

    @Override
    public double calculateFare(int distance) {
        double baseFare = 50;
        return baseFare + (distance * ratePerKm);
    }
}

