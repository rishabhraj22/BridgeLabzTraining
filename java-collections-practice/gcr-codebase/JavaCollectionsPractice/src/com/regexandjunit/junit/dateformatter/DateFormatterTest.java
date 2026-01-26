package com.regexandjunit.junit.dateformatter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DateFormatterTest {

    private final DateFormatter formatter = new DateFormatter();

    @Test
    void testValidDate() {
        assertEquals("24-01-2026", formatter.formatDate("2026-01-24"));
    }

    @Test
    void testInvalidDate() {
        assertThrows(
                IllegalArgumentException.class,
                () -> formatter.formatDate("24/01/2026")
        );
    }
}
