package com.regexandjunit.regex.creditcardnumber;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CreditCardValidatorTest {

    @Test
    void testVisaCard() {
        assertTrue(new CreditCardValidator().isValid("4123456789012345"));
    }

    @Test
    void testMasterCard() {
        assertTrue(new CreditCardValidator().isValid("5123456789012345"));
    }

    @Test
    void testInvalidCard() {
        assertFalse(new CreditCardValidator().isValid("3123456789012345"));
    }
}
