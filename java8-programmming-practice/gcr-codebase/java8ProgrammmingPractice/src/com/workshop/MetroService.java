package com.workshop;
public class MetroService implements TransportService {
    private String route;
    private double fare;
    private boolean peakTime;

    public MetroService(String route, double fare, boolean peakTime) {
        this.route = route;
        this.fare = fare;
        this.peakTime = peakTime;
    }

    @Override
    public String getServiceName() {
        return "Metro";
    }

    @Override
    public String getRoute() {
        return route;
    }

    @Override
    public double getFare() {
        return fare;
    }

    @Override
    public boolean isPeakTime() {
        return peakTime;
    }
}
