package com.LoanBuddy;
abstract class LoanApplication implements IApprovable {
    protected Applicant applicant;
    protected int term; // months
    protected double interestRate; // annual %
    private String loanStatus; // Approved / Rejected

    public LoanApplication(Applicant applicant, int term, double interestRate) {
        this.applicant = applicant;
        this.term = term;
        this.interestRate = interestRate;
        this.loanStatus = "Pending";
    }

    protected void setLoanStatus(String status) {
        this.loanStatus = status;
    }

    public String getLoanStatus() {
        return loanStatus;
    }

    protected double calculateEMIBase(double rateMultiplier) {
        double P = applicant.getLoanAmount();
        double R = (interestRate / 12 / 100) * rateMultiplier;
        int N = term;

        double emi = (P * R * Math.pow(1 + R, N)) /
                     (Math.pow(1 + R, N) - 1);
        return emi;
    }
}
