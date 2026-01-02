package com.EWalletApplication;

public class EWalletApp {
    public static void main(String[] args) {

        User u1 = new User(1, "Rohit", new PersonalWallet(true));
        User u2 = new User(2, "Anita", new BusinessWallet(false));

        u1.getWallet().loadMoney(6000);
        u2.getWallet().loadMoney(50000);

        u1.showBalance();
        u2.showBalance();

        u1.getWallet().transferTo(u2, 3000);
        u2.getWallet().transferTo(u1, 10000);

        u1.showBalance();
        u2.showBalance();

        System.out.println("\nRohit's Transactions:");
        u1.getWallet().showTransactions();
    }
}

