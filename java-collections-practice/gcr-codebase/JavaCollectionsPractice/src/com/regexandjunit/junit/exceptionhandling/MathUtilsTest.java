package com.regexandjunit.junit.exceptionhandling;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    @Test
    @DisplayName("Division by zero should throw ArithmeticException")
    void testDivideByZero() {

        MathUtils utils = new MathUtils();

        ArithmeticException exception = assertThrows(
                ArithmeticException.class,
                () -> utils.divide(10, 0)
        );

        assertEquals("Cannot divide by zero", exception.getMessage());
    }

    @Test
    @DisplayName("Valid division should return result")
    void testValidDivision() {
        MathUtils utils = new MathUtils();
        assertEquals(5, utils.divide(10, 2));
    }
}
