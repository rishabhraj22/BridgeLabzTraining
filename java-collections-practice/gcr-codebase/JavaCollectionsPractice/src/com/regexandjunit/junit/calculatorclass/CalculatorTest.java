package com.regexandjunit.junit.calculatorclass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Test addition of two numbers")
    void testAdd() {
        assertEquals(10, calculator.add(5, 5));
    }

    @Test
    @DisplayName("Test subtraction of two numbers")
    void testSubtract() {
        assertEquals(2, calculator.subtract(5, 3));
    }

    @Test
    @DisplayName("Test multiplication of two numbers")
    void testMultiply() {
        assertEquals(15, calculator.multiply(5, 3));
    }

    @Test
    @DisplayName("Test division of two numbers")
    void testDivide() {
        assertEquals(2, calculator.divide(10, 5));
    }

    @Test
    @DisplayName("Test division by zero throws exception")
    void testDivideByZero() {
        assertThrows(
            ArithmeticException.class,
            () -> calculator.divide(10, 0)
        );
    }
}
