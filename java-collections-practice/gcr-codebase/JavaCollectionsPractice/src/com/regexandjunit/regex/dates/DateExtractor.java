package com.regexandjunit.regex.dates;

import java.util.*;
import java.util.regex.*;

public class DateExtractor {

    private static final String REGEX = "\\b\\d{2}/\\d{2}/\\d{4}\\b";

    public List<String> extract(String text) {
        List<String> dates = new ArrayList<>();
        Matcher matcher = Pattern.compile(REGEX).matcher(text);

        while (matcher.find()) {
            dates.add(matcher.group());
        }
        return dates;
    }
}
