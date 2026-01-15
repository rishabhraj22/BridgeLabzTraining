package com.HomeNest;
class Light extends Device {

    public Light(int deviceId) {
        super(deviceId, 60); // 60W
    }

    @Override
    public void turnOn() {
        setStatus(true);
        System.out.println("💡 Light turned ON");
    }

    @Override
    public void turnOff() {
        setStatus(false);
        System.out.println("💡 Light turned OFF");
    }

    @Override
    public void reset() {
        setStatus(false);
        updateFirmwareLog("Light reset to factory settings");
        System.out.println("💡 Light reset completed");
    }
}
