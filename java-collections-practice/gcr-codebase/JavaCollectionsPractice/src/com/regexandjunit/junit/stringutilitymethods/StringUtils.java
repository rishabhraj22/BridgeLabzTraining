package com.regexandjunit.junit.stringutilitymethods;

public class StringUtils {

    public String reverse(String str) {
        if (str == null) {
            return null;
        }

        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    public boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }

        String cleaned = str.toLowerCase().replaceAll("\\s+", "");
        return cleaned.equals(reverse(cleaned));
    }

    public String toUpperCase(String str) {
        if (str == null) {
            return null;
        }
        return str.toUpperCase();
    }
}
