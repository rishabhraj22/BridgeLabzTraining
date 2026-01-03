package com.SmartHomeAutomationSystem;

class Light extends Appliance {

    public Light(int id) {
        super(id, 40); // default power
    }

    @Override
    public void turnOn() {
        setOn(true);
        System.out.println("Light turned ON (Soft illumination)");
    }

    @Override
    public void turnOff() {
        setOn(false);
        System.out.println("Light turned OFF");
    }

    @Override
    public void showStatus() {
        System.out.println("Light | Power: " + powerUsage + "W | ON: " + isOn());
    }
}

