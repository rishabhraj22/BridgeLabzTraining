package com.regexandjunit.regex.licenseplatenumber;

import java.util.regex.Pattern;

public class LicensePlateValidator {

    private static final String PLATE_REGEX = "^[A-Z]{2}[0-9]{4}$";
    private static final Pattern pattern = Pattern.compile(PLATE_REGEX);

    public boolean isValid(String plate) {
        if (plate == null) {
            return false;
        }
        return pattern.matcher(plate).matches();
    }
}
