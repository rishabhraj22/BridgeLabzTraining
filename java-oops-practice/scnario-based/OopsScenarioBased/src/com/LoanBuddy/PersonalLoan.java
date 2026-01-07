package com.LoanBuddy;
class PersonalLoan extends LoanApplication {

    public PersonalLoan(Applicant applicant, int term) {
        super(applicant, term, 14.0);
    }

    @Override
    public boolean approveLoan() {
        if (applicant.getCreditScore() >= 700 && applicant.getIncome() >= 40000) {
            setLoanStatus("Approved");
            return true;
        }
        setLoanStatus("Rejected");
        return false;
    }

    @Override
    public double calculateEMI() {
        return calculateEMIBase(1.2); // higher risk
    }
}
