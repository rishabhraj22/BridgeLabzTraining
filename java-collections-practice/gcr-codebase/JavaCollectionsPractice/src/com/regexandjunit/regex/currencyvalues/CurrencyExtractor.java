package com.regexandjunit.regex.currencyvalues;

import java.util.*;
import java.util.regex.*;

public class CurrencyExtractor {

    private static final String REGEX = "\\$?\\d+\\.\\d{2}";

    public List<String> extract(String text) {
        List<String> values = new ArrayList<>();
        Matcher matcher = Pattern.compile(REGEX).matcher(text);

        while (matcher.find()) {
            values.add(matcher.group());
        }
        return values;
    }
}
