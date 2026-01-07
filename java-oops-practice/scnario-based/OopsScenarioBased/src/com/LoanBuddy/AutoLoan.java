package com.LoanBuddy;
class AutoLoan extends LoanApplication {

    public AutoLoan(Applicant applicant, int term) {
        super(applicant, term, 10.0);
    }

    @Override
    public boolean approveLoan() {
        if (applicant.getCreditScore() >= 600 && applicant.getIncome() >= 25000) {
            setLoanStatus("Approved");
            return true;
        }
        setLoanStatus("Rejected");
        return false;
    }

    @Override
    public double calculateEMI() {
        return calculateEMIBase(1.1); // slightly higher risk
    }
}
