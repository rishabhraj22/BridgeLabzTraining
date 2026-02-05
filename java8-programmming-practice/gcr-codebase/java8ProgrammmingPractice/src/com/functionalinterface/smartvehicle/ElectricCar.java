package com.functionalinterface.smartvehicle;
public class ElectricCar implements VehicleDashboard {

    @Override
    public void displaySpeed(int speed) {
        System.out.println("Electric Car Speed: " + speed + " km/h");
    }

    @Override
    public void displayBattery(int batteryPercentage) {
        System.out.println("Electric Car Battery: " + batteryPercentage + "%");
    }
}
