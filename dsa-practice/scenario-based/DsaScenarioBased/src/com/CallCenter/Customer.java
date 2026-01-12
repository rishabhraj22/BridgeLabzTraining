package com.CallCenter;
public class Customer {

    private String customerId;
    private String name;
    private boolean isVIP;

    public Customer(String customerId, String name, boolean isVIP) {
        this.customerId = customerId;
        this.name = name;
        this.isVIP = isVIP;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public boolean isVIP() {
        return isVIP;
    }

    @Override
    public String toString() {
        return "Customer ID: " + customerId + ", Name: " + name + ", VIP: " + isVIP;
    }
}
