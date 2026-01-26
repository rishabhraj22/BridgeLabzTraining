package com.regexandjunit.regex.emailaddresses;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class EmailExtractorTest {

    @Test
    void testExtractEmails() {
        String text = "Contact us at support@example.com and info@company.org";

        EmailExtractor extractor = new EmailExtractor();
        List<String> result = extractor.extract(text);

        assertEquals(2, result.size());
        assertTrue(result.contains("support@example.com"));
        assertTrue(result.contains("info@company.org"));
    }
}
