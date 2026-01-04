package com.MyBank;

class CurrentAccount extends Account {

    public CurrentAccount(String accNo, double openingBalance) {
        super(accNo, openingBalance);
    }

    @Override
    public double calculateInterest() {
        return 0;
    }
}


