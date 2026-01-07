package com.ParkEase;
abstract class Vehicle implements IPayable {
    protected String vehicleNumber;
    protected String type;

    public Vehicle(String vehicleNumber, String type) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
