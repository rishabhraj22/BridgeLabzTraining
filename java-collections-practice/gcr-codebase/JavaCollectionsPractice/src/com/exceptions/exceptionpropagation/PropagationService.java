package com.exceptions.exceptionpropagation;
public class PropagationService {

    public static void method1() {
        int result = 10 / 0; // ArithmeticException occurs here
    }

    public static void method2() {
        method1(); // Exception propagates upward
    }
}
