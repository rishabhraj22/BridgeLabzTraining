package com.regexandjunit.regex.capitalizedwords;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class CapitalizedWordExtractorTest {

    @Test
    void testExtractCapitalizedWords() {
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";

        CapitalizedWordExtractor extractor = new CapitalizedWordExtractor();
        List<String> result = extractor.extract(text);

        assertTrue(result.contains("Eiffel"));
        assertTrue(result.contains("Tower"));
        assertTrue(result.contains("Paris"));
        assertTrue(result.contains("Statue"));
        assertTrue(result.contains("Liberty"));
        assertTrue(result.contains("New"));
        assertTrue(result.contains("York"));
    }
}
