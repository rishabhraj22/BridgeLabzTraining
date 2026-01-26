package com.regexandjunit.regex.hexcolorcode;

import java.util.regex.Pattern;

public class HexColorValidator {

    private static final String HEX_REGEX = "^#[A-Fa-f0-9]{6}$";
    private static final Pattern pattern = Pattern.compile(HEX_REGEX);

    public boolean isValid(String color) {
        if (color == null) {
            return false;
        }
        return pattern.matcher(color).matches();
    }
}
