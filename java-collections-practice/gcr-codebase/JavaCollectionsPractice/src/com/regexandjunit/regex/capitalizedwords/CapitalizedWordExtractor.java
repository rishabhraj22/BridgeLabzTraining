package com.regexandjunit.regex.capitalizedwords;

import java.util.*;
import java.util.regex.*;

public class CapitalizedWordExtractor {

    private static final String REGEX = "\\b[A-Z][a-z]*\\b";

    public List<String> extract(String text) {
        List<String> words = new ArrayList<>();
        Matcher matcher = Pattern.compile(REGEX).matcher(text);

        while (matcher.find()) {
            words.add(matcher.group());
        }
        return words;
    }
}
