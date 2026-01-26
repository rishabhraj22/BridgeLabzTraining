package com.regexandjunit.regex.emailaddresses;

import java.util.*;
import java.util.regex.*;

public class EmailExtractor {

    private static final String EMAIL_REGEX =
            "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";

    public List<String> extract(String text) {
        List<String> emails = new ArrayList<>();
        Matcher matcher = Pattern.compile(EMAIL_REGEX).matcher(text);

        while (matcher.find()) {
            emails.add(matcher.group());
        }
        return emails;
    }
}
