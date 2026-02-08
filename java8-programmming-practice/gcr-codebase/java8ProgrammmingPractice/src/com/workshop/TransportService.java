package com.workshop;
public interface TransportService {
    String getServiceName();
    String getRoute();
    double getFare();
    boolean isPeakTime();

    default void printServiceDetails() {
        System.out.println("Service: " + getServiceName()
                + " | Route: " + getRoute()
                + " | Fare: " + getFare()
                + " | Peak: " + isPeakTime());
    }
}
