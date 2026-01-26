package com.regexandjunit.regex.links;

import java.util.*;
import java.util.regex.*;

public class LinkExtractor {

    private static final String REGEX = "https?://[a-zA-Z0-9.-]+";

    public List<String> extract(String text) {
        List<String> links = new ArrayList<>();
        Matcher matcher = Pattern.compile(REGEX).matcher(text);

        while (matcher.find()) {
            links.add(matcher.group());
        }
        return links;
    }
}
