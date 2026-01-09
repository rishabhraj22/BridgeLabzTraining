package com.TourMate;
class Activity implements IBookable {
    private String name;
    private double cost;

    public Activity(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public void book() {
        System.out.println("🎡 Activity booked: " + name);
    }

    @Override
    public void cancel() {
        System.out.println("🎡 Activity cancelled: " + name);
    }
}
