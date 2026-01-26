package com.regexandjunit.regex.validateusername;

import java.util.regex.Pattern;

public class UsernameValidator {

    private static final String USERNAME_REGEX =
            "^[A-Za-z][A-Za-z0-9_]{4,14}$";

    private static final Pattern pattern =
            Pattern.compile(USERNAME_REGEX);

    public boolean isValid(String username) {
        if (username == null) {
            return false;
        }
        return pattern.matcher(username).matches();
    }
}
