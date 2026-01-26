package com.regexandjunit.regex.links;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class LinkExtractorTest {

    @Test
    void testExtractLinks() {
        String text = "Visit https://www.google.com and http://example.org";

        LinkExtractor extractor = new LinkExtractor();
        List<String> result = extractor.extract(text);

        assertEquals(2, result.size());
        assertTrue(result.contains("https://www.google.com"));
        assertTrue(result.contains("http://example.org"));
    }
}
