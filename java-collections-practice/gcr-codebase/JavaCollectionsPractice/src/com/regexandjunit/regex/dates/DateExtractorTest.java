package com.regexandjunit.regex.dates;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class DateExtractorTest {

    @Test
    void testExtractDates() {
        String text = "Dates: 12/05/2023, 15/08/2024, 29/02/2020";

        DateExtractor extractor = new DateExtractor();
        List<String> result = extractor.extract(text);

        assertEquals(3, result.size());
        assertTrue(result.contains("12/05/2023"));
        assertTrue(result.contains("15/08/2024"));
        assertTrue(result.contains("29/02/2020"));
    }
}
