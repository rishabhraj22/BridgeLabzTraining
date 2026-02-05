package com.functionalinterface.paymentgateway;
public class CreditCardPaymentProcessor implements PaymentProcessor {

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " via Credit Card");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refund of ₹" + amount + " credited back to Credit Card");
    }
}
