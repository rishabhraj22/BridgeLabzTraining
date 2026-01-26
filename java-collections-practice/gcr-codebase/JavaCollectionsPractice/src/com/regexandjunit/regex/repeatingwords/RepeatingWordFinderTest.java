package com.regexandjunit.regex.repeatingwords;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class RepeatingWordFinderTest {

    @Test
    void testRepeatingWords() {
        String text = "This is is a repeated repeated word test.";

        List<String> result = new RepeatingWordFinder().find(text);

        assertEquals(2, result.size());
        assertTrue(result.contains("is"));
        assertTrue(result.contains("repeated"));
    }
}
