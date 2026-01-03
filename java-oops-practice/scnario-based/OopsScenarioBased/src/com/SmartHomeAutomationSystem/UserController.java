package com.SmartHomeAutomationSystem;

class UserController {

    public void operate(Controllable device, boolean state) {
        if (state) {
            device.turnOn();
        } else {
            device.turnOff();
        }
    }

    public void compareEnergy(Appliance a1, Appliance a2) {
        if (a1.getPowerUsage() > a2.getPowerUsage()) {
            System.out.println("Device " + a1.deviceId + " consumes more energy");
        } else if (a1.getPowerUsage() < a2.getPowerUsage()) {
            System.out.println("Device " + a2.deviceId + " consumes more energy");
        } else {
            System.out.println("Both devices consume equal energy");
        }
    }
}

