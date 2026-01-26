package com.regexandjunit.regex.socialsecuritynumber;

public class SSNValidator {

    private static final String SSN_REGEX = "^\\d{3}-\\d{2}-\\d{4}$";

    public boolean isValid(String ssn) {
        return ssn != null && ssn.matches(SSN_REGEX);
    }
}
