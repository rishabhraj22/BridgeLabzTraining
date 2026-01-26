package com.regexandjunit.regex.programminglanguages;

import java.util.*;
import java.util.regex.*;

public class LanguageExtractor {

    private static final String REGEX =
            "\\b(Java|Python|JavaScript|Go|C\\+\\+|C#)\\b";

    public List<String> extract(String text) {
        List<String> result = new ArrayList<>();
        Matcher matcher = Pattern.compile(REGEX).matcher(text);

        while (matcher.find()) {
            result.add(matcher.group());
        }
        return result;
    }
}
