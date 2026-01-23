package com.collections.insurancemanagement;
import java.time.LocalDate;

public class Policy {

    private String policyNumber;
    private String policyHolderName;
    private LocalDate expiryDate;
    private String coverageType;
    private double premium;

    public Policy(String policyNumber, String policyHolderName,
                  LocalDate expiryDate, String coverageType, double premium) {
        this.policyNumber = policyNumber;
        this.policyHolderName = policyHolderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premium = premium;
    }

    public String getPolicyNumber() { return policyNumber; }
    public String getPolicyHolderName() { return policyHolderName; }
    public LocalDate getExpiryDate() { return expiryDate; }

    @Override
    public String toString() {
        return "Policy{" +
                "number='" + policyNumber + '\'' +
                ", holder='" + policyHolderName + '\'' +
                ", expiry=" + expiryDate +
                ", type='" + coverageType + '\'' +
                ", premium=" + premium +
                '}';
    }
}
