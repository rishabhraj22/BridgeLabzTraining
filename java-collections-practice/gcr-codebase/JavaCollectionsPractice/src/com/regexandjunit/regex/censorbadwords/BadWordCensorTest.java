package com.regexandjunit.regex.censorbadwords;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BadWordCensorTest {

    @Test
    void testCensorBadWords() {
        String input = "This is a damn bad example with some stupid words.";
        List<String> badWords = List.of("damn", "stupid");

        String expected = "This is a **** bad example with some **** words.";

        BadWordCensor censor = new BadWordCensor();
        assertEquals(expected, censor.censor(input, badWords));
    }
}
