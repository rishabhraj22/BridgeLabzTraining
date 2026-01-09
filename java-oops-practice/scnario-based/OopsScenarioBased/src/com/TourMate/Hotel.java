package com.TourMate;
class Hotel implements IBookable {
    private String name;
    private double costPerNight;
    private int nights;

    public Hotel(String name, double costPerNight, int nights) {
        this.name = name;
        this.costPerNight = costPerNight;
        this.nights = nights;
    }

    public double getTotalCost() {
        return costPerNight * nights;
    }

    @Override
    public void book() {
        System.out.println("🏨 Hotel booked: " + name);
    }

    @Override
    public void cancel() {
        System.out.println("🏨 Hotel booking cancelled: " + name);
    }
}
