package com.regexandjunit.regex.repeatingwords;

import java.util.*;
import java.util.regex.*;

public class RepeatingWordFinder {

    private static final String REGEX = "\\b(\\w+)\\b\\s+\\1\\b";

    public List<String> find(String text) {
        List<String> result = new ArrayList<>();
        Matcher matcher = Pattern.compile(REGEX, Pattern.CASE_INSENSITIVE).matcher(text);

        while (matcher.find()) {
            result.add(matcher.group(1));
        }
        return result;
    }
}
