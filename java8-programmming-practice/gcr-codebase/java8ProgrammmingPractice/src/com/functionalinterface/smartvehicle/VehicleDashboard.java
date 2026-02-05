package com.functionalinterface.smartvehicle;
public interface VehicleDashboard {

    void displaySpeed(int speed);

    default void displayBattery(int batteryPercentage) {
        System.out.println("Battery Level: " + batteryPercentage + "%");
    }
}
