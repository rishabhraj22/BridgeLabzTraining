package com.SmartHomeAutomationSystem;

class AC extends Appliance {
    private int temperature;

    public AC(int id, int temperature) {
        super(id, 1500);
        this.temperature = temperature;
    }

    @Override
    public void turnOn() {
        setOn(true);
        System.out.println("AC turned ON at " + temperature + "°C (Cooling mode)");
    }

    @Override
    public void turnOff() {
        setOn(false);
        System.out.println("AC turned OFF");
    }

    @Override
    public void showStatus() {
        System.out.println("AC | Temp: " + temperature +
                "°C | Power: " + powerUsage + "W | ON: " + isOn());
    }
}

