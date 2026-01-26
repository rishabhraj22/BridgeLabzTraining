package com.regexandjunit.regex.multiplespaceswithsinglespace;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SpaceNormalizerTest {

    @Test
    void testReplaceMultipleSpaces() {
        String input = "This   is   an   example    with   multiple   spaces.";
        String expected = "This is an example with multiple spaces.";

        SpaceNormalizer normalizer = new SpaceNormalizer();
        assertEquals(expected, normalizer.normalize(input));
    }
}
