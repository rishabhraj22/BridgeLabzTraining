package com.regexandjunit.junit.userregistration;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserRegistrationTest {

    private final UserRegistration registration = new UserRegistration();

    @Test
    void testValidRegistration() {
        assertDoesNotThrow(() ->
                registration.registerUser("rishabh", "rishabh@mail.com", "pass123")
        );
    }

    @Test
    void testInvalidRegistration() {
        assertThrows(IllegalArgumentException.class,
                () -> registration.registerUser("", "mail.com", "123")
        );
    }
}
