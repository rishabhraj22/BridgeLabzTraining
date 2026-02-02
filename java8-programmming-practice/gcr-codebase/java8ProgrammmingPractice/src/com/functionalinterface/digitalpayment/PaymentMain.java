package com.functionalinterface.digitalpayment;
import java.util.Scanner;

public class PaymentMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Payment Method: 1.UPI  2.Credit Card  3.Wallet");
        int choice = sc.nextInt();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        Payment payment;

        if (choice == 1) {
            payment = new UPIPayment();
        } else if (choice == 2) {
            payment = new CreditCardPayment();
        } else {
            payment = new WalletPayment();
        }

        payment.pay(amount);

        sc.close();
    }
}
