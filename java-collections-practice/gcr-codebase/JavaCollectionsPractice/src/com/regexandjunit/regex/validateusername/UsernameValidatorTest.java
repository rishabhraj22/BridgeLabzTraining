package com.regexandjunit.regex.validateusername;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UsernameValidatorTest {

    private final UsernameValidator validator = new UsernameValidator();

    @Test
    void testValidUsername() {
        assertTrue(validator.isValid("user_123"));
    }

    @Test
    void testInvalidUsernameStartsWithNumber() {
        assertFalse(validator.isValid("123user"));
    }

    @Test
    void testInvalidUsernameTooShort() {
        assertFalse(validator.isValid("us"));
    }
}
