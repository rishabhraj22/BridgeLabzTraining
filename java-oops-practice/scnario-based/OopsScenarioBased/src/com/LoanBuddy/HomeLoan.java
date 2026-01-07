package com.LoanBuddy;
class HomeLoan extends LoanApplication {

    public HomeLoan(Applicant applicant, int term) {
        super(applicant, term, 8.5);
    }

    @Override
    public boolean approveLoan() {
        if (applicant.getCreditScore() >= 650 && applicant.getIncome() >= 30000) {
            setLoanStatus("Approved");
            return true;
        }
        setLoanStatus("Rejected");
        return false;
    }

    @Override
    public double calculateEMI() {
        return calculateEMIBase(1.0); // normal rate
    }
}
