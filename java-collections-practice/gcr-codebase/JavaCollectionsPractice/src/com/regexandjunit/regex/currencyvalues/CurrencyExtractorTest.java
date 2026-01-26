package com.regexandjunit.regex.currencyvalues;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class CurrencyExtractorTest {

    @Test
    void testExtractCurrency() {
        String text = "The price is $45.99, and the discount is 10.50.";

        List<String> result = new CurrencyExtractor().extract(text);

        assertEquals(2, result.size());
        assertTrue(result.contains("$45.99"));
        assertTrue(result.contains("10.50"));
    }
}
