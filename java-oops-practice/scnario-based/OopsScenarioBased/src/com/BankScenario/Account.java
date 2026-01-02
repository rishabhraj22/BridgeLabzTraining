package com.BankScenario;

//Base class
class Account {
 protected double balance;

 Account(double balance) {
     this.balance = balance;
 }

 void deposit(double amount) {
     if (amount <= 0) {
         System.out.println("Invalid deposit amount");
         return;
     }
     balance += amount;
     System.out.println("Deposited: ₹" + amount);
 }

 void withdraw(double amount) {
     if (amount <= 0) {
         System.out.println("Invalid withdrawal amount");
         return;
     }

     if (amount > balance) {
         System.out.println("Insufficient balance");
         return;
     }

     balance -= amount;
     System.out.println("Withdrawn: ₹" + amount);
 }

 double getBalance() {
     return balance;
 }
}

