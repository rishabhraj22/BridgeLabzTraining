package com.SmartHomeAutomationSystem;

abstract class Appliance implements Controllable {
    protected int deviceId;
    protected int powerUsage;   // watts
    private boolean isOn;

    public Appliance(int deviceId, int powerUsage) {
        this.deviceId = deviceId;
        this.powerUsage = powerUsage;
        this.isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }

    protected void setOn(boolean status) {
        this.isOn = status;
    }

    public int getPowerUsage() {
        return powerUsage;
    }

    public abstract void showStatus();
}

