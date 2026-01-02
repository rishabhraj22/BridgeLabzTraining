package com.EWalletApplication;

class BusinessWallet extends Wallet {

    public BusinessWallet(boolean referral) {
        super(referral);
    }

    @Override
    public void transferTo(User receiver, double amount) {
        double tax = amount * 0.02;   // 2% tax
        double total = amount + tax;

        if (total > 50000) {
            System.out.println("Business transfer limit exceeded");
            return;
        }

        if (debit(total)) {
            receiver.getWallet().credit(amount);
            System.out.println("Business Transfer Successful (Tax Applied)");
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}

