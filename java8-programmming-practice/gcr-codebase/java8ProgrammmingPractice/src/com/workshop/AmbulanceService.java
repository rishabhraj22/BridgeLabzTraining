package com.workshop;
public class AmbulanceService implements TransportService, EmergencyService {
    private String route;
    private double fare;
    private boolean peakTime;

    public AmbulanceService(String route) {
        this.route = route;
        this.fare = 0.0; // Emergency service is free
        this.peakTime = false;
    }

    @Override
    public String getServiceName() {
        return "Ambulance";
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
