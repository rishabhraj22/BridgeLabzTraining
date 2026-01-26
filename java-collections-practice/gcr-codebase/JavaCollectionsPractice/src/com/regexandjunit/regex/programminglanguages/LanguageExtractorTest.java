package com.regexandjunit.regex.programminglanguages;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class LanguageExtractorTest {

    @Test
    void testExtractLanguages() {
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        List<String> langs = new LanguageExtractor().extract(text);

        assertEquals(4, langs.size());
        assertTrue(langs.contains("Java"));
        assertTrue(langs.contains("Python"));
        assertTrue(langs.contains("JavaScript"));
        assertTrue(langs.contains("Go"));
    }
}
