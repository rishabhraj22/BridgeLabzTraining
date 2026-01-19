package com.RoboWarehouse;
public class PackageItem {

    private int packageId;
    private double weight;

    public PackageItem(int packageId, double weight) {
        this.packageId = packageId;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void display() {
        System.out.println("Package ID: " + packageId + ", Weight: " + weight + " kg");
    }
}
