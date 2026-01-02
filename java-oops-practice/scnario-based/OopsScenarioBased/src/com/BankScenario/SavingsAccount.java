package com.BankScenario;

//SavingsAccount extends Account
class SavingsAccount extends Account {
 private double interestRate;

 SavingsAccount(double balance, double interestRate) {
     super(balance);
     this.interestRate = interestRate;
 }

 void calculateInterest() {
     double interest = balance * interestRate / 100;
     balance += interest;
     System.out.println("Interest added: ₹" + interest);
 }
}


