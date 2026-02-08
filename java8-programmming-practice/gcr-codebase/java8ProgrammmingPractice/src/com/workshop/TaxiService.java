package com.workshop;
public class TaxiService implements TransportService {
    private String route;
    private double fare;
    private boolean peakTime;

    public TaxiService(String route, double fare, boolean peakTime) {
        this.route = route;
        this.fare = fare;
        this.peakTime = peakTime;
    }

    @Override
    public String getServiceName() {
        return "Taxi";
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
