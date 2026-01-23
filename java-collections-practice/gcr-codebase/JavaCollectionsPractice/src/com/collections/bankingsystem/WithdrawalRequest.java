package com.collections.bankingsystem;
public class WithdrawalRequest {
    String accountNumber;
    double amount;

    public WithdrawalRequest(String acc, double amt) {
        this.accountNumber = acc;
        this.amount = amt;
    }
}
