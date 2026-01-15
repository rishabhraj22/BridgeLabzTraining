package com.HomeNest;
abstract class Device implements IControllable {
    protected int deviceId;
    protected double energyUsage; // in watts
    private boolean status; // ON/OFF - cannot be modified externally

    private String firmwareLog; // secured log

    public Device(int deviceId, double energyUsage) {
        this.deviceId = deviceId;
        this.energyUsage = energyUsage;
        this.status = false;
        this.firmwareLog = "Firmware v1.0 installed";
    }

    public boolean isOn() {
        return status;
    }

    protected void setStatus(boolean status) {
        this.status = status;
    }

    protected void updateFirmwareLog(String log) {
        this.firmwareLog = log;
    }

    public void showStatus() {
        System.out.println("Device ID: " + deviceId +
                " | Status: " + (status ? "ON" : "OFF") +
                " | Energy Usage: " + energyUsage + "W");
    }

    public void showFirmwareLog() {
        System.out.println("Firmware Log: " + firmwareLog);
    }
}
