package com.regexandjunit.regex.socialsecuritynumber;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SSNValidatorTest {

    @Test
    void testValidSSN() {
        assertTrue(new SSNValidator().isValid("123-45-6789"));
    }

    @Test
    void testInvalidSSN() {
        assertFalse(new SSNValidator().isValid("123456789"));
    }
}
