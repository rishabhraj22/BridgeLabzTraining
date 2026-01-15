package com.HomeNest;
class Camera extends Device {

    public Camera(int deviceId) {
        super(deviceId, 120); // 120W
    }

    @Override
    public void turnOn() {
        setStatus(true);
        System.out.println("📷 Camera activated");
    }

    @Override
    public void turnOff() {
        setStatus(false);
        System.out.println("📷 Camera deactivated");
    }

    @Override
    public void reset() {
        setStatus(false);
        updateFirmwareLog("Camera firmware reinstalled");
        System.out.println("📷 Camera reset & firmware updated");
    }
}
