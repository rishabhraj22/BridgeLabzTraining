package com.regexandjunit.junit.passwordstrengthvalidator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    private final PasswordValidator validator = new PasswordValidator();

    @Test
    void testValidPassword() {
        assertTrue(validator.isValid("Strong123"));
    }

    @Test
    void testInvalidPassword() {
        assertFalse(validator.isValid("weak"));
        assertFalse(validator.isValid("nouppercase1"));
        assertFalse(validator.isValid("NoDigitHere"));
    }
}
