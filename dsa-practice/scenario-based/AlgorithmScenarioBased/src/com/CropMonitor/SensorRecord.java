package com.CropMonitor;
public class SensorRecord {

    private long timestamp;   // Unix timestamp or HHMMSS
    private double temperature;

    public SensorRecord(long timestamp, double temperature) {
        this.timestamp = timestamp;
        this.temperature = temperature;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public double getTemperature() {
        return temperature;
    }

    public void display() {
        System.out.println("Time: " + timestamp + ", Temp: " + temperature + "°C");
    }
}
