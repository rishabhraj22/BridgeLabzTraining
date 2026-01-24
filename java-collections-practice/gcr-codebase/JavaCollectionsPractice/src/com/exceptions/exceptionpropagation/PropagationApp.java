package com.exceptions.exceptionpropagation;
public class PropagationApp {

    public static void main(String[] args) {

        try {
            PropagationService.method2();
        } catch (ArithmeticException e) {
            System.out.println("Handled exception in main");
        }
    }
}
