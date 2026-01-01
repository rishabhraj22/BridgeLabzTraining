package com.inheritence.SmartHomeDevices;

public class SmartHomeTest {
    public static void main(String[] args) {

        Thermostat thermostat = new Thermostat("TH-101", true, 22.5);
        thermostat.displayStatus();
    }
}

