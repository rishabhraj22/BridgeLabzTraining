package com.TourMate;
abstract class Trip {
    protected String destination;
    protected int duration;
    protected double budget;

    protected Hotel hotel;
    protected Transport transport;
    protected Activity activity;

    public Trip(String destination, int duration, Hotel hotel, Transport transport, Activity activity) {
        this.destination = destination;
        this.duration = duration;
        this.hotel = hotel;
        this.transport = transport;
        this.activity = activity;
        this.budget = calculateTotalBudget();
    }

    protected double calculateTotalBudget() {
        return hotel.getTotalCost() + transport.getCost() + activity.getCost();
    }

    public abstract void bookTrip();
    public abstract void cancelTrip();

    public void showTripDetails() {
        System.out.println("\n--- Trip Details ---");
        System.out.println("Destination: " + destination);
        System.out.println("Duration: " + duration + " days");
        System.out.println("Total Budget: ₹" + budget);
    }
}
