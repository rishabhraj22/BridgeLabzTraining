package com.MyBank;

interface ITransaction {
    void deposit(double amount);
    void withdraw(double amount);
    double checkBalance();
}

