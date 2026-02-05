package com.functionalinterface.paymentgateway;
import java.util.Scanner;

public class PaymentGatewayMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Payment Method: 1.UPI  2.Credit Card");
        int choice = sc.nextInt();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        PaymentProcessor processor;

        if (choice == 1) {
            processor = new UPIPaymentProcessor();
        } else {
            processor = new CreditCardPaymentProcessor();
        }

        processor.pay(amount);
        processor.refund(amount);

        sc.close();
    }
}
