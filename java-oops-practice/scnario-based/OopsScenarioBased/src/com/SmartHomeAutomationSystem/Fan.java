package com.SmartHomeAutomationSystem;

class Fan extends Appliance {
    private int speed;

    public Fan(int id, int speed) {
        super(id, 75);
        this.speed = speed;
    }

    @Override
    public void turnOn() {
        setOn(true);
        System.out.println("Fan turned ON at speed " + speed);
    }

    @Override
    public void turnOff() {
        setOn(false);
        System.out.println("Fan turned OFF");
    }

    @Override
    public void showStatus() {
        System.out.println("Fan | Speed: " + speed +
                " | Power: " + powerUsage + "W | ON: " + isOn());
    }
}

