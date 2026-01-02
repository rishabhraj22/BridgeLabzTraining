package com.EWalletApplication;

class PersonalWallet extends Wallet {

    public PersonalWallet(boolean referral) {
        super(referral);
    }

    @Override
    public void transferTo(User receiver, double amount) {
        if (amount > 5000) {
            System.out.println("Transfer limit exceeded for Personal Wallet");
            return;
        }

        if (debit(amount)) {
            receiver.getWallet().credit(amount);
            System.out.println("Personal Transfer Successful");
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}

