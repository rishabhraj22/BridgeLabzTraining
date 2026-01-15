package com.HomeNest;
class Thermostat extends Device {

    public Thermostat(int deviceId) {
        super(deviceId, 150); // 150W
    }

    @Override
    public void turnOn() {
        setStatus(true);
        System.out.println("🌡 Thermostat turned ON");
    }

    @Override
    public void turnOff() {
        setStatus(false);
        System.out.println("🌡 Thermostat turned OFF");
    }

    @Override
    public void reset() {
        setStatus(false);
        updateFirmwareLog("Thermostat calibrated and reset");
        System.out.println("🌡 Thermostat reset & calibrated");
    }
}
