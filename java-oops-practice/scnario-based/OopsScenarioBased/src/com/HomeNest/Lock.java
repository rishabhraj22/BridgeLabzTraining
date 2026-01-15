package com.HomeNest;
class Lock extends Device {

    public Lock(int deviceId) {
        super(deviceId, 30); // 30W
    }

    @Override
    public void turnOn() {
        setStatus(true);
        System.out.println("🔐 Lock engaged");
    }

    @Override
    public void turnOff() {
        setStatus(false);
        System.out.println("🔐 Lock disengaged");
    }

    @Override
    public void reset() {
        setStatus(false);
        updateFirmwareLog("Lock security keys regenerated");
        System.out.println("🔐 Lock reset & security updated");
    }
}
