package com.exceptions.finallyblockexecution;
public class DivisionService {

    public static int divide(int a, int b) {
        return a / b; // May throw ArithmeticException
    }
}
