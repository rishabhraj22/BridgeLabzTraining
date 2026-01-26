package com.regexandjunit.regex.IPaddress;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IPAddressValidatorTest {

    @Test
    void testValidIP() {
        assertTrue(new IPAddressValidator().isValid("192.168.1.1"));
    }

    @Test
    void testInvalidIP() {
        assertFalse(new IPAddressValidator().isValid("256.100.1.1"));
    }
}
