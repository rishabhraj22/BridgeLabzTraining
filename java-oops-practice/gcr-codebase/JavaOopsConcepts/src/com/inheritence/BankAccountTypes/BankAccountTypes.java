package com.inheritence.BankAccountTypes;

//Superclass
class BankAccount {
 String accountNumber;
 double balance;

 BankAccount(String accountNumber, double balance) {
     this.accountNumber = accountNumber;
     this.balance = balance;
 }

 void displayAccountDetails() {
     System.out.println("Account Number: " + accountNumber);
     System.out.println("Balance: ₹" + balance);
 }

 void displayAccountType() {
     System.out.println("Generic Bank Account");
 }
}

