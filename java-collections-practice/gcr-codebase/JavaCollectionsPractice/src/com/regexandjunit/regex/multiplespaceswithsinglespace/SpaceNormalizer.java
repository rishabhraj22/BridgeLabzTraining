package com.regexandjunit.regex.multiplespaceswithsinglespace;

public class SpaceNormalizer {

    public String normalize(String text) {
        if (text == null) {
            return null;
        }
        return text.replaceAll("\\s+", " ").trim();
    }
}
