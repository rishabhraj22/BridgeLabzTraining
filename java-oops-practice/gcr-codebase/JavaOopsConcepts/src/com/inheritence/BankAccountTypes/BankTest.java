package com.inheritence.BankAccountTypes;

public class BankTest {
    public static void main(String[] args) {

        BankAccount a1 = new SavingsAccount("SB101", 50000, 4.5);
        BankAccount a2 = new CheckingAccount("CA201", 30000, 10000);
        BankAccount a3 = new FixedDepositAccount("FD301", 100000, 24);

        a1.displayAccountType();
        a1.displayAccountDetails();
        System.out.println("------------------");

        a2.displayAccountType();
        a2.displayAccountDetails();
        System.out.println("------------------");

        a3.displayAccountType();
        a3.displayAccountDetails();
    }
}

