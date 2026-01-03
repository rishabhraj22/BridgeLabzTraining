package com.CabbyGo;

class RideService implements IRideService {
    private Vehicle vehicle;
    private Driver driver;
    private double fare;
    private boolean isRideActive;

    public RideService(Vehicle vehicle, Driver driver) {
        this.vehicle = vehicle;
        this.driver = driver;
        this.isRideActive = false;
    }

    @Override
    public void bookRide(int distance) {
        isRideActive = true;
        fare = vehicle.calculateFare(distance);
        System.out.println("Ride booked with " + vehicle.getType() +
                " | Driver: " + driver.getName());
    }

    @Override
    public void endRide() {
        if (isRideActive) {
            isRideActive = false;
            System.out.println("Ride ended. Total Fare: ₹" + fare);
        } else {
            System.out.println("No active ride found.");
        }
    }
}

