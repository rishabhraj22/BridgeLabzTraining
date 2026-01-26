package com.regexandjunit.regex.censorbadwords;

import java.util.List;

public class BadWordCensor {

    public String censor(String text, List<String> badWords) {
        if (text == null || badWords == null) {
            return text;
        }

        String result = text;
        for (String word : badWords) {
            result = result.replaceAll("(?i)\\b" + word + "\\b", "****");
        }
        return result;
    }
}
